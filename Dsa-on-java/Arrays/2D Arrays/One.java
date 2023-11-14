import java.util.Arrays;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        /*
         * it is also known as multi dimensional array
         * 1 3 4
         * 2 7 8
         * 8 6 9
         */
        Scanner input = new Scanner(System.in);
        int[][] num = new int[3][];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter the integer to store" + (i + 1) + " : ");
            int size = input.nextInt();
            num[i] = new int[size];
        }

        System.out.println("");

        System.out.println(Arrays.toString(num));

    }

}
