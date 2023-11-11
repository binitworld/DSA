import java.util.Scanner;

public class Storing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Syntax :
        // datatype[] variable name = new datatype[size]

        // store the 5 roll number

        int[] roll_numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the roll numbers " + (i + 1) + " : ");
            roll_numbers[i] = input.nextInt();

        }
        System.out.println("");
        System.out.println("The Entered roll numbers  are : ");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Roll Number " + (i + 1) + " : " + roll_numbers[i]);
        }

    }
}
