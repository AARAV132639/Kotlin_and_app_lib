import java.io.*;
import java.net.*;

public class ChatClient{

    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 5000;

    public static void main(String [] args)
    {
        try(Socket socket = new Socket(SERVER_HOST, SERVER_PORT);

        BufferedReader serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter serverOut = new PrintWriter(socket.getOutputStream(),true);

        BufferedReader keyboard = 
        new BufferedReader(new InputStreamReader(System.in)))
        {
            //Thread responsible for receiving messages
            Thread readerThread = new Thread(()->
            {
                try
                {
                    String message;
                    while((message=serverIn.readLine())!=null) System.out.println(message);
                }
                catch(IOException e){
                    System.out.println("Disconnected from server");
                }
            });

            readerThread.start();

            //Main thread sends messages
            String message;

            while((message=keyboard.readLine())!=null)
            {
                serverOut.println(message);

                if(message.equalsIgnoreCase("/quit")) break;
            }
        }
        catch(IOException e)
            {
                System.err.println("Could not connect to server:" +e.getMessage());
            }
    }
    
}