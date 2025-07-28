package Post_Immersion.DAY1;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class D1_Q3 {

    private static final List<String[]> homophoneList = Arrays.asList(
        new String[]{"pair", "pear"},
        new String[]{"bare", "bear"},
        new String[]{"to", "too"},
        new String[]{"two", "too"},
        new String[]{"right", "write"},
        new String[]{"no", "know"},
        new String[]{"knight", "night"},
        new String[]{"flower", "flour"},
        new String[]{"see", "sea"},
        new String[]{"meet", "meat"},
        new String[]{"sun", "son"},
        new String[]{"their", "there"},
        new String[]{"hear", "here"}
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] pair = homophoneList.get(random.nextInt(homophoneList.size()));
        String wordToShow = pair[0];
        String correctAnswer = pair[1];

        System.out.println("🤖 CAPTCHA Verification: ");
        System.out.println("What is the homophone of: \"" + wordToShow + "\" ?");
        System.out.print("Your Answer: ");
        String userAnswer = scanner.nextLine().trim().toLowerCase();

        if (userAnswer.equals(correctAnswer)) {
            System.out.println("✅ Verified! You're not a robot.");
        } else {
            System.out.println("❌ Incorrect. Verification failed.");
            System.out.println("Expected answer was: \"" + correctAnswer + "\"");
        }

        scanner.close();
    }
}
