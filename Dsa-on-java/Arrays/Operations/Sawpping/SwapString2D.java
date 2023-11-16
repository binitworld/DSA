package Sawpping;

import java.util.Arrays;
import java.util.Scanner;

public class SwapString2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] names = new String[2][2];
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names.length; col++) {
                System.out.print("Enter the name of values to store in the row " + (row + 1) + " , & their  column "
                        + (col + 1) + " : ");
                names[row][col] = in.next();

            }
        }
        System.out.println("");
        System.out.println("The resulted output is");
        System.out.println("");
        for (String[] a : names) {
            System.out.println(Arrays.toString(a));
        }
        swap(names, 1, 0, 0, 1);
        System.out.println("After the swapping of the indexes the Result will be ");
        for (String[] a : names) {
            System.out.println(Arrays.toString(a));
        }
    }

    static void swap(String[][] names, int row1, int col0, int row0, int col1) {
        String temp = names[row1][col0];
        names[row1][col0] = names[row0][col1];
        names[row0][col1] = temp;
    }
}
