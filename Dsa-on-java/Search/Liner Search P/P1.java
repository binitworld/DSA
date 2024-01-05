import java.util.Scanner;
import java.util.Arrays;
public class P1 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        
        
        int [][] num = new int[3][3];

        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num.length; col++) {
                System.out.print("Enter the number in column "+ (col+1) + " of the row number " +(row +1) + " : ");
                num[row][col] = in.nextInt();
                
            }
        }
        System.out.println();
        System.out.println("Your  array will  be look like this :");
        System.out.println();

        for(int [] m :num){
            System.out.println(Arrays.toString(m));
        }

    }
}