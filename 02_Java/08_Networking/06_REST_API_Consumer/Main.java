public class Main {

    public static void main(String[] args) {

        ApiClieHttpResponse apiClient= new ApiClieHttpResponse();

        String url = "https://jsonplaceholder.typicode.com/posts/1";

        try{

            String response = apiClient.get(url);

            System.out.println("\n Response:");
            System.out.println(response);
        }
        catch(Exception e)
        {
            System.out.println("Request failed: "+e.getMessage());
        }
    }
    
}
