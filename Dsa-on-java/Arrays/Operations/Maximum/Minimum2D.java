import java.util.Arrays;
import java.util.Scanner;

public class Minimum2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] net = new int[3][3];
        for (int i = 0; i < net.length; i++) {
            for (int j = 0; j < net[i].length; j++) {
                System.out.print("Enter the data for row " + (i + 1) + ",& its column is" + (j + 1) + ":");
                net[i][j] = in.nextInt();

            }
        }
        System.out.println("");
        System.out.println("Your result looks like : ");
        System.out.println("");
        for (int[] a : net) {
            System.out.println(Arrays.toString(a));
        }
        // System.out.println("");
        // System.out.println("Now we see the output value to converted to minimum by
        // using minimum operation : ");
        System.out.println("");

        int minimum = min(net);
        System.out.println("The resulted minimum value is :  " + minimum);
    }

    static int min(int[][] net) {
        int minVal = net[0][0];
        for (int i = 0; i < net.length; i++) {
            for (int j = 0; j < net[i].length; j++) {

                if (net[i][j] < minVal) {
                    minVal = net[i][j];

                }

            }

        }
        return minVal;
    }
}
