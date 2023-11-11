
// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Modification {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = new String[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the names of your Professor" + (i + 1) + " : ");
            arr[i] = in.next();
        }
        System.out.println("");// For making spaces
        // output

        System.out.println("Names of fav. Professor  are: ");
        System.out.println(" ");
        System.out.println(Arrays.toString(arr));

        // modify the objects Stored in the array
        arr[0] = "Pushpemdra";
        System.out.println(Arrays.toString(arr));
    }
}
