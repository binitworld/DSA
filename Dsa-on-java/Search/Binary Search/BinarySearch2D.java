import java.util.Arrays;

import java.util.Comparator;
import java.util.Scanner;

public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number of row required to stored the array :");
        int x =in.nextInt();
        System.out.print("Enter The number of column required to stored the array :");
        int y =in.nextInt();
        int[][] two = new int[x][y];

        for (int row = 0; row < two.length; row++) {
            for (int col = 0; col < two.length; col++) {
                System.out.print("Enter the integer value you want to store in the row "+(row+1)+" at column "+(col+1)+" : ");
                two[row][col]= in.nextInt();
            }
        }
        Arrays.sort(two,Comparator.comparing(arr -> arr[0]));
        System.out.println();
        System.out.println("Your resulted Sorted matrices will be look like :-)");
        System.out.println();
        for(int[] n : two){
            System.out.println(Arrays.toString(n));
        }
    }
    
}
