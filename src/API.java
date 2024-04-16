import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    public static ValoresMoedas obterValoresMoedas(String moeda) {
        URI url_str = URI.create("https://v6.exchangerate-api.com/v6/36b636852da9adc147499fd1/latest/" + moeda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url_str)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            String responseBody = response.body();
            return gson.fromJson(responseBody, ValoresMoedas.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Falha na solicitação. Código de status: " + e);
        }
    }
}