import java.util.Arrays;
import java.util.Scanner;

public class P1d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] test = new int[56];
        
        for (int i = 0; i < test.length; i++) {
            System.out.print("Enter the element  "+( i+1 ) + "  to be stored  in this array : ");
            test[i]=in.nextInt();
        }
        Arrays.sort(test);
        System.out.println("");
        System.out.println("Your resulted Sorted element will be look like :");
        System.out.println(Arrays.toString(test));

        System.out.println("ENter the target element you looking at : ");
        int target = in.nextInt();
        int ans = binarysearch(test, target);

        if (ans == -1) {
            System.out.println("please enter the correct target element");
        }else{
            System.out.println("Your target element is found at "+ans);
        }
    }
    static int binarysearch(int[] array, int target){
        int start = array[0];
        int end =array.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target<array[mid]) {
                end = mid-1;
            }else if (target> array[mid]) {
                start =mid+1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }
}
