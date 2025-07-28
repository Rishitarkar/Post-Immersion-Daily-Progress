package Post_Immersion.DAY1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D1_Q4 {

    private static final Set<String> homophonePairs = new HashSet<>(Arrays.asList(
        "pair-pear", "bare-bear", "to-too", "two-too", "right-write",
        "no-know", "knight-night", "flower-flour", "see-sea",
        "meet-meat", "sun-son", "their-there", "hear-here"
    ));

    public static boolean isHomophonePair(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        String pair1 = word1 + "-" + word2;
        String pair2 = word2 + "-" + word1;
        return homophonePairs.contains(pair1) || homophonePairs.contains(pair2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase().replaceAll("[^a-z\\s]", "");

        String[] words = sentence.split("\\s+");
        Set<String> foundPairs = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isHomophonePair(words[i], words[j])) {
                    String pair = words[i] + " & " + words[j];
                    foundPairs.add(pair);
                }
            }
        }

        if (foundPairs.isEmpty()) {
            System.out.println("No homophone pairs found.");
        } else {
            System.out.println("Found " + foundPairs.size() + " homophone pairs:");
            for (String p : foundPairs) {
                System.out.println(" - " + p);
            }
        }

        scanner.close();
    }
}
