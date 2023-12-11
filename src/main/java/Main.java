import response.Activity;
import response.Joke;
import response.User;
import response.UserResponse;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args)
    {
        try {

            BookFetcher bookFetcher = new BookFetcher();
            bookFetcher.getBookList("mid-century", 2005, 2023, 30);
            //BookFetcher anotherBookFetcher = new BookFetcher();

            // activities
//            ActivityFetcher activityFetcher = new ActivityFetcher();
//
////          Activity activity = activityFetcher.getRandomActivity();
//            Activity activity = activityFetcher.getActivityByType("recreational");
//
//            System.out.println("Activity: " + activity.getActivity());
//            System.out.println("Type: " + activity.getType());
//            if (!activity.getLink().isBlank()) {
//                System.out.println("Link: " + activity.getLink());
//            }
//
//            // jokes
//            JokeFetcher jokeFetcher = new JokeFetcher();
//            Joke randomJoke = jokeFetcher.getRandomJoke();
//            System.out.println();
//            System.out.println(randomJoke.getSetup());
//            System.out.println(randomJoke.getPunchline());
//
//            List<Joke> randomTen = jokeFetcher.getRandomTen();
//            for (response.Joke joke : randomTen) {
//                System.out.println();
//                System.out.println(joke.getSetup());
//                System.out.println(joke.getPunchline());
//            }
//
//            // users
//            UserFetcher userFetcher = new UserFetcher();
//            UserResponse userResponse = userFetcher.getRandomUser();
//            for (User user : userResponse.getResults()) {
//                System.out.println();
//                System.out.println("Name: " + user.getName().getFirst());
//                System.out.println("Gender: " + user.getGender());
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
