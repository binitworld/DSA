import java.util.Arrays;
import java.util.Scanner;

public class Learn2d{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] data=new int[3][3];

        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data.length; col++) {
                System.out.print("Enter the  value store in row "+(row+1)+ " at column no. " +(col+1)+ " : ");
                data[row][col]=in.nextInt();
                
            }
        }
        System.out.println();
        System.out.println("Your resulted 2D Array will Look like :-)");
        System.out.println();

        for (int[]m : data) {
            System.out.println(Arrays.toString(m));
        }

        System.out.print("Enter the target value you have to find :");
        int target = in.nextInt();
        int[] ans= linearSearch(data, target);
        
        if (ans[0] == -1){
            System.out.println("Target not found in any index in the given array");

        }else{
            System.out.println("Target was fount in the array at row " +(ans[0]+1) +"and column"+(ans[1]+1));
        }
    }
    static int[] linearSearch(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if( arr[row][col] == target){
                    return new int[] {row, col}; // Return row and column as an array
                }
            }
        }
        return new int[]{-1, -1}; 
    }
}