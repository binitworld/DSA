package Sawpping;

import java.util.Arrays;
import java.util.Scanner;

public class Swap2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] test = new int[3][3];
        for (int row = 0; row < test.length; row++) {
            for (int col = 0; col < test.length; col++) {
                System.out.println("Enter The Number stored in the row number " + (row + 1) + ", & its column number "
                        + (col + 1) + " : ");
                test[row][col] = in.nextInt();

            }

        }
        System.out.println("");
        System.out.println("The resulted out put be like :");
        System.out.println("");

        for (int[] a : test)
            System.out.println(Arrays.toString(a));

        swap(test, 0, 2, 1, 2);
        System.out.println("After Swaping the output the next will be :");
        for (int[] a : test)
            System.out.println(Arrays.toString(a));
    }

    static void swap(int[][] test, int row1, int col1, int row2, int col2) {
        int temp = test[row1][col1];
        test[row1][col1] = test[row2][col2];
        test[row2][col2] = temp;

    }
}
