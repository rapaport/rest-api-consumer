import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import response.Joke;

import java.io.IOException;
import java.util.List;

// Documentation https://github.com/15Dkatz/official_joke_api
public class JokeFetcher {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final WebApiFetcher webApiFetcher = new WebApiFetcher();

    // response type is single object
    public Joke getRandomJoke() throws IOException {
        String apiUrl = "https://official-joke-api.appspot.com/jokes/random";
        String apiResponse = webApiFetcher.fetchDataFromApi(apiUrl);

        // convert String to Joke object
        return objectMapper.readValue(apiResponse, Joke.class);
    }

    // get a array of objects response
    public List<Joke> getRandomTen() throws IOException {
        String apiUrl = "https://official-joke-api.appspot.com/jokes/ten";
        String apiResponse = webApiFetcher.fetchDataFromApi(apiUrl);

        // if the json response is an array, you can wrap the Type in a TypeReference List like this
        return objectMapper.readValue(apiResponse, new TypeReference<List<Joke>>() {});
    }
}
