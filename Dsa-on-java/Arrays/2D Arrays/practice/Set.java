// Write a Java program to find the sum of all the elements in a 2D array.

import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] Addition = new int[3][3];

        for (int row = 0; row < Addition.length; row++) {
            for (int col = 0; col < Addition[row].length; col++) {
                System.out.println("Enter the num for row" + (row + 1) + ",and for this Column" + (col + 1) + ":");
                Addition[row][col] = in.nextInt();
            }
        }
        // output
        System.out.println("The stored Matrix is ");
        for (int row = 0; row < Addition.length; row++) {
            for (int col = 0; col < Addition[row].length; col++) {
                System.out.print(Addition[row][col] + " ");

            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < Addition.length; i++) {
            for (int j = 0; j < Addition[i].length; j++) {
                sum += Addition[i][j];

            }
            System.out.println(sum);
        }

    }
}