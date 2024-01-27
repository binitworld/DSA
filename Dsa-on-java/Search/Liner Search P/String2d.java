import java.util.Arrays;
import java.util.Scanner;

public class String2d{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String[][] friend= new String[3][3];
        for (int row = 0; row < friend.length; row++) {
            for (int col = 0;  col< friend.length; col++) {
                System.out.print("Enter the lint of friend in row  "+(row+1)+"  at column no. "+(col+1)+" :");
                friend[row][col] =in.next();
                
            }
        }
        System.out.println();
        System.out.println("Your friend list will stored in multidimensional array will look like:");
        System.out.println();
        for(String[] m : friend){
            System.out.println(Arrays.toString(m));
        }
        System.out.println("Enter the target friend name you have to find :");
        String target = in.next();
        int[] ans = linearSearch2d(friend, target);

        if (ans[0] == -1) {
            System.out.println("You have entered wrong input name ! please try again");
        }else{
            System.out.println("Your friend name was found at row " +(ans[0]+1)+" and at column no."+(ans[1]+1));
        }
    }
    static int[] linearSearch2d(String[][] array, String target){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                if (array[row][col].equals(target)) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}