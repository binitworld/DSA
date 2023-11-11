import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Arr of Premitive.
        int[] arr = new int[5];
        arr[0] = 45;
        arr[1] = 23;
        arr[2] = 90;
        arr[3] = 78;
        arr[5 - 1] = 67;
        // System.out.println(arr[4]);
        // System.out.println(arr[4 - 4]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the list of array to be stored " + (i + 1) + " : ");
            arr[i] = in.nextInt();
        }
        System.out.println(" ");
        System.out.println("The output is :");
        System.out.println(" ");

        // Other ways to print the output is using the Array.toString(arr/name)
        System.out.println(Arrays.toString(arr));
        // Output/printing using for loops
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // for (int num : arr) { // For every Element in Array print the Element
        // System.out.print(num + " "); // here num represents the elements of the array
        // }
        System.out.println(" ");
        System.out.println("Arr. Of OBJECTS ");
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter the names of your Batch Mates : " + (i + 1) + " : ");
            str[i] = in.next();

        }

        // output as

        System.out.println(" ");
        System.out.println(" The names of your Batch mates Are : ");
        System.out.println(" ");

        System.out.println(Arrays.toString(str));

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }

    }
}
