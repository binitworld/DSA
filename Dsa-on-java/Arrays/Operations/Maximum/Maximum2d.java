import java.util.Arrays;
import java.util.Scanner;

public class Maximum2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] num = new int[3][3];
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                System.out.print(
                        "Enter the numbers in row " + (row + 1) + " ,& their numbers in column " + (col + 1) + " : ");
                num[row][col] = in.nextInt();

            }

        }
        System.out.println("");
        System.out.println("The resulted 2D matrix is :");
        System.out.println("");

        for (int[] a : num)
            System.out.println(Arrays.toString(a));

        int maximum = max(num);
        System.out.println("The resulted maximum value in this is: " + maximum);
    }

    static int max(int[][] num) {
        int maxVal = num[0][0];
        for (int i = 0; i < num.length; i++) {
            for (int k = 0; k < num[i].length; k++) {

                if (num[i][k] > maxVal) {
                    maxVal = num[i][k];
                }
            }
        }
        return maxVal;
    }
}
