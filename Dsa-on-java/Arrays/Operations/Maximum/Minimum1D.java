import java.util.Arrays;
import java.util.Scanner;

public class Minimum1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] min = new int[6];
        for (int i = 0; i < min.length; i++) {
            System.out.print("Enter the numbers to find the min S0, Number " + (i + 1) + ":");
            min[i] = in.nextInt();
        }

        System.out.println(" ");
        System.out.println(Arrays.toString(min));
        System.out.println(" ");

        int minimum = findMin(min);
        System.out.println("The minimum number among them is: " + minimum);
    }

    static int findMin(int[] min) {
        int minVal = min[0];
        for (int i = 1; i < min.length; i++) {
            if (min[i] < minVal) {
                minVal = min[i];
            }
        }
        return minVal;
    }
}
