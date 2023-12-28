import java.util.Arrays;
import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int[][] cluster = new int[3][3];

        for (int row = 0; row < cluster.length;row++) {
            for (int col = 0; col < cluster[row].length; col++) {
                System.out.print("Enter the the number to store in "+( row+1 )+" row respectively in its column "+( col + 1 ) +" is :");
                cluster[row][col]=in.nextInt();
            }

        }
        
        System.out.println();
        System.out.println("Your resulted output is ");
        System.out.println();

        for (int row = 0; row < cluster.length; row++) {

            System.out.println(Arrays.toString(cluster[row]));
            
        }
    }    
}
