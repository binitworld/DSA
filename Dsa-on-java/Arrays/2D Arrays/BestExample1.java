import java.util.Arrays;
import java.util.Scanner;

public class BestExample1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[3][];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter the size of array " + (i + 1) + " : ");
            int size = input.nextInt();
            num[i] = new int[size];

            System.out.println("Enter integers to store in array " + (i + 1) + " : ");
            for (int j = 0; j < size; j++) {
                num[i][j] = input.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(num));
    }
}
