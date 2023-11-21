
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[7];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the Number you to store at " + (i + 1) + " place : ");
            num[i] = in.nextInt();
        }

        System.out.println("");
        System.out.println("Your Result will look Like this:");
        System.out.println("");
        System.out.println(Arrays.toString(num));

        System.out.println("Enter the number you want to search:");
        int target = in.nextInt();

        int result = linearSearch(num, target);

        if (result != -1) {
            System.out.println(" Target found at index number : " + result);
        } else {
            System.out.println("Target Not found at any indexes / Thanks!");
        }

    }

    // linear search in the array : return the index if item found
    // Other wise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }
        for (int i = 0; i < arr.length; i++) {
            // cHeck for every element at every index if it is = target for search
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;

    }
}