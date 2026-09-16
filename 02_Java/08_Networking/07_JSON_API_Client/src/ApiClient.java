import com.fasterxml.jackson.databin.ObjectMapper;
import java.io.IOException;
import java.net.http.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient{
    
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public ApiClient()
    {
        httpClient = HttpClient.newBuilder().build();

        objectMapper = new ObjectMapper();
    }

    public <T>T get(String url, Class<T>responseType) throws IOException,InterruptedException{
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Accept","application/json").GET().build();
        HttpResponse<String>response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if(response.statusCode()<200||response.statusCode()>=300)
        {
            throw new RuntimeException("API request failed. Status:"+response.statusCode());

        }

        return objectMapper.readValue(response.body(),responseType);
    }
}
