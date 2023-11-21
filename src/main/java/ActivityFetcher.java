import com.fasterxml.jackson.databind.ObjectMapper;
import response.Activity;

import java.io.IOException;

// API Documentation https://www.boredapi.com/documentation
public class ActivityFetcher {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final WebApiFetcher webApiFetcher = new WebApiFetcher();

    public Activity getRandomActivity() throws IOException {
        String apiUrl = "http://www.boredapi.com/api/activity";
        String apiResponse = webApiFetcher.fetchDataFromApi(apiUrl);

        return objectMapper.readValue(apiResponse, Activity.class);
    }

    // use parameters in api url -> url?parameter1=value1&parameter2=value2
    public Activity getActivityByType(String type) throws IOException {
        String apiUrl = "http://www.boredapi.com/api/activity?type=" + type;
        String apiResponse = webApiFetcher.fetchDataFromApi(apiUrl);

        return objectMapper.readValue(apiResponse, Activity.class);
    }
}
