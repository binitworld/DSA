// Using enhance for loop

import java.util.Arrays;
import java.util.Scanner;

public class Output3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out
                        .print(" Enter the number for row " + (row + 1) + ", and for its column " + (col + 1) + " : ");
                arr[row][col] = in.nextInt();
            }
        }
        // for (int row = 0; row < arr.length; row++) {
        // System.out.println(Arrays.toString(arr[row]));

        // }
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
