
import java.util.Scanner;

public class Substraction{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the First number: ");
        int a = input.nextInt();
        
        System.out.print("Enter the Second number: ");
        int b = input.nextInt();

        int c = a-b;
        System.out.println("The Submission of two number is : " + c);
    }
}