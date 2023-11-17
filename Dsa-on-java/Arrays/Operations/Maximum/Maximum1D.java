// package Maximum;

import java.util.Scanner;

public class Maximum1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[7];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the Choice of number  " + (i + 1) + " : ");
            num[i] = in.nextInt();

        }
        System.out.println(" ");
        System.out.println(" The result  of max value is ");
        System.out.println(" ");

        System.out.println(max(num));
    }

    static int max(int[] num) {
        int maxVal = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxVal) {
                maxVal = num[i];

            }

        }
        return maxVal;

    }
}
