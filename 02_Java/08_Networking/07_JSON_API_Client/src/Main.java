public class Main {
    
    public static void main(String[] args)
    {
        ApiClient apiClient = new ApiClient();

        String url = "https://jsonplaceholder.typicode.com/posts/1";

        try{

            Post post = apiCleint.get(url, Post.class);
            System.out.println("ID:" + post.getId());
            System.out.println("UserId: "+post.getUserId());
            System.out.println("Title: "+post.getTitle());
            Systemout.println("Body:"+post.getBody());

        }
        catch(Exception e){
            System.err.println("Error: "+e.getMessage());
        }
    }
}
