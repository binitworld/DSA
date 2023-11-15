import java.util.Arrays;
import java.util.Scanner;

public class String2d1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] practice = new String[3][2];
        for (int row = 0; row < practice.length; row++) {
            for (int col = 0; col < practice[row].length; col++) {

                System.out.print(
                        "Enter the name of Your culprits" + (row + 1) + " , & other also for this" + (col + 1) + ":");
                practice[row][col] = in.next();
            }

        }
        System.out.println("");
        System.out.println("The output is like : ");
        System.out.println("");

        for (String[] a : practice) {
            System.out.println(Arrays.toString(a));
        }
    }

}
