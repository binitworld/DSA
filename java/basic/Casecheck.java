import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next(); // Read the entire word as a string

        if (word.length() > 0) {
            char firstCharacter = word.charAt(0);
            System.out.println("The first character is: " + firstCharacter);
            System.out.println("The trimmed word is: " + word.trim());
        } else {
            System.out.println("You did not enter a word.");
        }
    }
}
