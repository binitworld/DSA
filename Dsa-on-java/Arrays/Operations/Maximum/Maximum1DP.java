import java.util.Arrays;
import java.util.Scanner;

public class Maximum1DP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] test = new int[4];
        for (int i = 0; i < test.length; i++) {
            System.out.print("Enter the Number As per Your Choice. So, Number " + (i + 1) + " : ");
            test[i] = in.nextInt();

        }
        System.out.println("");
        System.out.println(Arrays.toString(test));
        System.out.println("");
        // Call the max method and print the result
        int maximum = max(test);
        System.out.println("And the Maximum No. in this is: " + maximum);
    }
    // }

    static int max(int[] test) {
        int maxVal = test[0];
        for (int i = 1; i < test.length; i++) {
            if (test[i] > maxVal) {
                maxVal = test[i];
            }

        }
        return maxVal;
        // System.out.print("And the Maximum No. in this is: " + maxVal);
    }
}
