import java.util.Arrays;
import java.util.Scanner;

public class Learn1d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = new int[16];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter the data in the array at position  "+(i+1)+" :");
            data[i]=in.nextInt();
            
        }
        System.out.println();
        System.out.println("Resulted  Data will be : ");
        System.out.println();
        System.out.println(Arrays.toString(data));
        
        System.out.println("Enter the target value you want to find : ");
        int target= in.nextInt();
        int ans  = linearSearch(data, target);

        if(ans ==-1){
            System.out.print("Enter Target is not found at the given index in the array ");
        }else{
            System.out.println("Target is found  at the index  "+ans);

        }


    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1; // Return -1 if target is not found
    }
}
