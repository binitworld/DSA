import java.util.Arrays;
// import java.util.Scanner;

public class NoInput {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        int[][] num = {
                { 45, 67, 90 },
                { 90, 80, 56 },
                { 12, 54, 87 }, };

        System.out.println(Arrays.deepToString(num));

        System.out.println(
                "It is the array of an array  like it has 3 array stored in the different array  take an eg. of the x -> {45, 67, 90} y -> {90,80,56 }");
    }
}