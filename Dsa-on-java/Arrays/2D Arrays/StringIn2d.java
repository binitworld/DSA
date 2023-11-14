import java.util.Arrays;
import java.util.Scanner;

public class StringIn2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] name = new String[3][3];
        for (int row = 0; row < name.length; row++) {
            for (int col = 0; col < name[row].length; col++) {
                System.out.print("Enter the names of your Current BatchMates" + (row + 1)
                        + " , & accordingly your favorite" + (col + 1) + " : ");
                name[row][col] = in.next();

            }

        }
        for (String[] n : name) {
            System.out.println(Arrays.toString(n));

        }
    }

}
