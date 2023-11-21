import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class WebApiFetcher {

    public String fetchDataFromApi(String apiUrl) throws IOException {
        // Create a URL object with the API endpoint
        URL url = new URL(apiUrl);

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method to GET
        connection.setRequestMethod("GET"); // GET, PUT, POST, DELETE

        // Get the response code
        int responseCode = connection.getResponseCode(); // 200 - Success, 404 - Not Found

        if (responseCode == HttpURLConnection.HTTP_OK) {
            // Read the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // Close the connection
            connection.disconnect();

            return response.toString();
        } else {
            // Close the connection
            connection.disconnect();

            throw new RuntimeException("Failed to fetch data from API. Response Code: " + responseCode);
        }
    }
}
