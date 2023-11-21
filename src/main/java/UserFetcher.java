import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import response.Activity;
import response.UserResponse;

import java.io.IOException;

// Documentation https://randomuser.me/documentation
public class UserFetcher {

    // in order to ignore some fields in the json response, here is how to configure the object mapper
    private final ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    private final WebApiFetcher webApiFetcher = new WebApiFetcher();

    public UserResponse getRandomUser() throws IOException {
        String apiUrl = "https://randomuser.me/api/?inc=gender,name,nat";
        String apiResponse = webApiFetcher.fetchDataFromApi(apiUrl);

        return objectMapper.readValue(apiResponse, UserResponse.class);
    }
}
