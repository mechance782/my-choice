import java.util.*;
/**
 * The MapsAndLists class does xyz...
 */
public class MapsAndLists {
    /**
     * The main method reads pairs of usernames and comments from a txt file, stores them in lists, and 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> usernames = new ArrayList<>();
        List<String> comments = new ArrayList<>();
        Map<String, String> userComments = new HashMap<>();

        while (input.hasNext()){
            String user = input.next();
            // usernames.add(input.next());
            // comments.add(input.nextLine());
            userComments.put(input.nextLine(), user);
        }
        input.close();

        System.out.println(userComments);
        // System.out.println(listComments(usernames, comments));
    }

    public static Map<String, String> listComments(List<String> usernames, List<String> comments){
        // Map<String, String> userComments = new HashMap<>();

        // for (String comment : comments){
        //     for (String user : usernames){
        //         userComments.put(comment, user);
        //     }
        // }
        return null;
    }

}