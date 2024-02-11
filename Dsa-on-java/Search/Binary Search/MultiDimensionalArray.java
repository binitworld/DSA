import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of Rows You want to store in :")
        int x = in.nextInt();
        System.out.print("Enter no. of column You want to store in :")
        int y=in.nextInt();

        int[][] array=new int[x][y];

        for (int row = 0; row < array.length; row++) {
            for (int colm = 0; colm< array.length; colm++) {
                System.out.print("Enter the integer value to store at row  "+ (row+1)+"in the column no. "+(colm+1) +" :")
                array[row][colm] = in.nextInt();
            }
            
        }
        Arrays.sort()
        System.out.println("");
        System.out.println("Your resulted output be look like:-) ");
        System.out.println();
        
        for(int[]n: array){
            System.out.println(Arrays.toString(n));
        }
        System.out.print("Enter the target element you have to found :");
        int target =in.nextInt();

        int[] ans =search(array, target);
        if (ans[0] ==-1) {
            System.out.println("Target Element was not found | Enter the correct no. | Tray Again!!");

        }else{
            System.out.println("Target element was found at the row  "+(ans[0]+1)+" and at column "+(ans[1]+1));
        }

    }
    static int[] search(int[][] matrix , int target){
        int r = 0;
        int c = matrix.length -1;
        while(r<matrix.length && c>=0) {
            if(matrix[r][c]==target) {
                return new int[](r,c);
            }
            if (matrix[r][c]<target) {
                r++;
            }else{
                c--;
            }
            
        }   
        return new int[]{-1,-1};
    }
    
    
}