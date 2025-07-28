package Post_Immersion.DAY1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D1_Q2 {

    private static final Set<String> homophonePairs = new HashSet<>(Arrays.asList(
        "pair-pear", "bare-bear", "to-too", "two-too", "right-write", "no-know",
        "knight-night", "flower-flour", "see-sea", "meet-meat", "sun-son",
        "their-there", "hear-here"
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
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.toLowerCase().split("\\s+");
        boolean found = false;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (areHomophones(words[i], words[j])) {
                    System.out.println("✔ Homophone found: '" + words[i] + "' and '" + words[j] + "'");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("✘ No homophones found in the sentence.");
        }

        scanner.close();
    }
}
