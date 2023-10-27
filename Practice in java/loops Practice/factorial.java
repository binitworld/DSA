import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number Whose factorial you have to find out : ");
        int n =input.nextInt();
        System.out.print("Enter the number's factorial  : ");
        int factorial =input.nextInt();

        for (int i = 1 ;i <= n ; i++ ){
            factorial *= i;
        
            System.out.println("The factorial  of " + n + "is" + factorial);

        }

    }
}
