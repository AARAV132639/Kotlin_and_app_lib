import java.io.IOException;
import  java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClieHttpResponse{

    public final HttpClient client;

    public ApiClieHttpResponse(){
        client = HttpClient.newHttpClient();
    }

    public String get(String url) throws IOException, InterruptedException{

        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create(url))
                                .GET()
                                .build();
        
        HttpResponse<String>response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code:"+response.statusCode());

        return response.body();
    }
}