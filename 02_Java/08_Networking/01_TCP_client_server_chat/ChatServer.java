import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class ChatServer{
    
    private static final int PORT = 5000;

    //Thread-safe set of connected clients

    private static final Set <ClientHandler>clients = ConcurrentHashMap.newKeySet();

    public static void main(String[] args) {
        
        System.out.println("Starting chat server...");

        try(ServerSocket serverSocket= new ServerSocket(PORT)){
            System.out.println("Server listening on port" + PORT);

            while(true){
                Socket socket = serverSocket.accept();

                ClientHandler client = new ClientHandler(socket);
                clients.add(client);

                new Thread(client).start();
            }
            
            }
            catch(IOException e){
                System.err.println("Server error: "+e.getMessage());
        }
    }

    static void broadcast(String message, ClientHandler sender){
        for (ClientHandler client: clients)
        {
            if(client!=sender) client.sendMessage(message);
        }
    }

    static void removeClient(ClientHandler client)
    {
        clients.remove(client);
    }

    static class ClientHandler implements Runnable{
        private final Socket socket;
        private PrintWriter out;
        private String username;

        ClientHandler(Socket socket)
        {
            this.socket = socket;
        }

        @Override 
        public void run()
        {
            try(BufferedReader in = new BufferedReader (new InputStreamReader(socket.getInputStream())))
            {
                out = new PrintWriter (socket.getOutputStream(),true);
                out.println("Enter your username: ");
                username = in.readLine();

                if(username ==null||username.isBlank()) return;

                System.out.println(username + "connected");

                broadcast(">>>"+username+"joined the chat.",this);

                out.println("Type messages and press Enter.");

                String message;
                while((message= in.readLine())!=null)
                {
                    if(message.equalsIgnoreCase("/quit")) break;
                    
                    String formatted = username + ":" + message;

                    System.out.println(formatted);

                    broadcast(formatted, this);
                }
            }

                catch(IOException e)
                {
                    System.out.println(username +"disconnected");
                }
                finally{
                    removeClient(this);

                    if(username!=null)
                    {
                        broadcast(">>>>"+username+"left",this);
                    }
                }
                try{
                    socket.close();
                }catch(IOException ignored){}
            }

            void sendMessage(String message)
            {
                if(out!=null) out.println(message);
            }         
        
        }        
    }
