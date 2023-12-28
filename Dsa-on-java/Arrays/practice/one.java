import java.util.Arrays;
import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int  [] ques = new int[10];

        for (int i = 0; i < ques.length; i++) {
            System.out.print("Enter the " +( i+1 )+" to be store  is : ");
            ques[i] =in.nextInt();
        }
        System.out.println();
        System.out.println("Your resulted input must be ");
        System.out.println();

        System.out.println(Arrays.toString(ques));
    }

}