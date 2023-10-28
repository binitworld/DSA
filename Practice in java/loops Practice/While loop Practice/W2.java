import java.util.Scanner;

public class W2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number up to which you want to print : ");
        int i = input.nextInt();
        System.out.print("Enter the number Till in reverse oder  u wanted to print  : ");
        int n = input.nextInt();

        System.out.println("The reverse order of number up to you wnt to print is :");
        // int i = 0;
        while (i>=n) {
            System.out.println(i);
            i--;
            
        }

    }
    
}
