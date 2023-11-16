package Sawpping;

import java.util.Arrays;
import java.util.Scanner;

public class SwapString1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name " + (i + 1) + ",to stores in the list " + " : ");
            names[i] = in.next();
        }
        System.out.println("");
        System.out.println("The Result is ");
        System.out.println("");
        System.out.println(Arrays.toString(names));

        swap(names, 0, 4);
        System.out.println("The result after swapping the first place with last index we get ");
        System.out.println(Arrays.toString(names));
    }

    static void swap(String[] names, int index0, int index4) {
        String temp = names[index0];
        names[index0] = names[index4];
        names[index4] = temp;
    }
}
