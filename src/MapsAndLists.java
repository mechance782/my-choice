import java.util.*;
/**
 * The MapsAndLists class does xyz...
 */
public class MapsAndLists {
    /**
     * The main method reads pairs of usernames and comments from a txt file and stores them in a HashMap as Strings and lists of Strings
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(listComments(input));
    }

    /**
     * The listComments method takes a txt file of matched usernames and comments and stores them in a Map of Strings and Lists of String.
     * Each username becomes a key and all comments made by that user are stored in a List as the value for that key.
     * @param input Scanner object that reads txt file provided in the terminal
     * @return Map containing username Strings and Lists of comment Strings from the user as key, value pairs.
     */
    public static Map<String, List<String>> listComments(Scanner input){
        Map<String, List<String>> userComments = new HashMap<>();

        while (input.hasNext()){
            String user = input.next();
            String comment = input.nextLine();
            
            if (!userComments.containsKey(user)){
                userComments.put(user, (new ArrayList<>(Arrays.asList(comment))));
            } else {
                userComments.get(user).add(comment);
            }
            

        }
        input.close();

        
        return userComments;
    }

}