import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Number to Store in the  array  " + (i + 1) + " : ");
            arr[i] = in.nextInt();

        }

        System.out.println("");
        System.out.println("Your Result is :");
        System.out.println("");

        System.out.println(Arrays.toString(arr));

        swap(arr, 5, 3);
        System.out.println("After the Swap of index no5 and the 3  we get ");
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index5, int index3) {
        int temp = arr[index5];
        arr[index5] = arr[index3];
        arr[index3] = temp;

    }
}
