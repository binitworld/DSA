import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] num = new int[3][3];
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num.length; col++) {
                System.out.print("Enter the number in " + (row + 1) + "st row and in its " + (col + 1) + " column :");
                num[row][col] = in.nextInt();

            }

        }
        System.out.println("");
        System.out.println("Your resulted  array will be ");
        System.out.println("");
        for (int[] m : num) {
            System.out.println(Arrays.toString(m));
        }

        System.out.print("Enter Target number to find in the given array :");
        int target= in.nextInt();
        

        int[] ans= linearSearch2d(num, target);

        if (ans[0]==-1) {
            System.out.println("Target element is not found at any index of the given array ");
        }else{
            System.out.println("target element was find at the row "+(ans[0]+1)+" at column "+(ans[1]+1));
        }
    }
    static int[] linearSearch2d(int[][] array ,int target){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                int element = array[row][col];
                if (element ==target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
