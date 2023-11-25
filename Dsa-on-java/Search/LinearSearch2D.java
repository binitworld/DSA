import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] num = new int[3][3];
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num.length; col++) {
                System.out.print("Enter the number in " + (row + 1) + "st row and in its " + (col + 1) + " column :");
                num[row][col] = in.nextInt();

            }

        }
        System.out.println("");
        System.out.println("Your resulted  array will be ");
        System.out.println("");
        for (int[] m : num) {
            System.out.println(Arrays.toString(m));
        }
    }
}
