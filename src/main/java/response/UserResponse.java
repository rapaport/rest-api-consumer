package response;

import java.util.List;

// response objects can have nested objects or lists of objects
public class UserResponse {

    private List<User> results;

    public List<User> getResults() {
        return results;
    }
}
