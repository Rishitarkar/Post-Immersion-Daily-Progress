package Post_Immersion.DAY1;
// Q1)Write a program that checks whether the two input words are homophones from a given homophones list.  
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D1_Q1 {

    private static final Set<String> homophonePairs = new HashSet<>(Arrays.asList(
        "pair-pear", "bare-bear", "to-too", "two-too", "right-write", "no-know",
        "knight-night", "flower-flour", "see-sea", "meet-meat", "sun-son", "their-there", "hear-here"
    ));

    public static boolean areHomophones(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        String pair1 = word1 + "-" + word2;
        String pair2 = word2 + "-" + word1;
        return homophonePairs.contains(pair1) || homophonePairs.contains(pair2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        if (areHomophones(word1, word2)) {
            System.out.println("✔ '" + word1 + "' and '" + word2 + "' are homophones.");
        } else {
            System.out.println("✘ '" + word1 + "' and '" + word2 + "' are NOT homophones.");
        }

        scanner.close();
    }
}
