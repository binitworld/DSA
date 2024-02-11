
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.print("Enter The first number : ");
        int a = input.nextInt();
        
        System.out.print("Enter the Second number:");
        int b =  input.nextInt();

        int c = a*b;
        System.out.println("The multiplication of two number is : " + c );
    }
}
