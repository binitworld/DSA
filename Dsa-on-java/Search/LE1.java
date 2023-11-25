import java.util.Arrays;
import java.util.Scanner;

public class LE1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] roll = new int[7];
        for (int i = 0; i < roll.length; i++) {
            System.out.print("Enter the roll numbers to be stored at place " + (i + 1) + " : ");
            roll[i] = in.nextInt();

        }
        System.out.println("");
        System.out.println("Your output will be :");
        System.out.println("");
        System.out.println(Arrays.toString(roll));

        System.out.print("Enter the Number you want to search in this above list :");
        int target = in.nextInt();

        int result = LinearSearch1D(roll, target);

        if (result != -1) {
            System.out.println("The target " + result);

        } else {
            System.out.println("Target not found , Thank you!");
        }
    }

    static int LinearSearch1D(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;

            }
        }
        return -1;
    }
}
