import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] example = new int[3][3];

        for (int row = 0; row < example.length; row++) {

            for (int col = 0; col < example[row].length; col++) {
                System.out.print("Enter the num for Column " + (col + 1) + ":");

                example[row][col] = input.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(example));

    }
}
