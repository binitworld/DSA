import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch1d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[9];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter the number "+(i+1)+" to store :");
            num[i]=in.nextInt();
        }

        Arrays.sort(num);
        System.out.println();
        System.out.println("Resulted Sorted Array will look Like as :-)");
        System.out.println();
        System.out.println(Arrays.toString(num));

        System.out.print("Enter the target element you are looking at : ");
        int target =in.nextInt();
        int ans = binarySearch(num, target);

        if (ans== -1) {
            System.out.println("Please enter the correct target element yo ar looking ,We did not find such number!");
            
        }else{
            System.out.println("Resulted element is found at "+ ans);
        }

    }    
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start<=end) {
            // int mid =(start+end)/2;  ///might be some problem in case of large number when we exceed in start+end
                int mid = start +(end-start) /2;// so the better way is !
                if (target< arr[mid]) {
                    end = mid-1;
                }else if(target> arr[mid]){
                    start= mid+1;
                }else{
                    return mid;
                }
                
            }
        return -1;
    }
}

