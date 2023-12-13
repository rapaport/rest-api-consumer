import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class BookFetcher {
    private final WebApiFetcher webApiFetcher = new WebApiFetcher();
    private final ObjectMapper objectMapper = new ObjectMapper();



    public void getBookList (String subject, int startYear, int endYear, int maxResults) throws IOException {
        String apiUrl = "https://openlibrary.org/subjects/" + subject + ".json?published_in=" + startYear + "-" + endYear + "&limit="+ maxResults;
        String booksResult = webApiFetcher.fetchDataFromApi(apiUrl);
        System.out.println(booksResult);

        //BookRes res = objectMapper.readValue(booksResult);

    }




}
