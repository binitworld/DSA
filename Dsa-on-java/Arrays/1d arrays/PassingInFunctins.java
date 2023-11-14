import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunctins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the Vehicle numbers" + (i + 1) + ":");
            num[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println(Arrays.toString(num));
        changes(num);
        System.out.println(Arrays.toString(num));

    }

    static void changes(int[] num) {
        num[0] = 89;
    }

}