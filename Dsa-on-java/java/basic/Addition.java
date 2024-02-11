import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the value of First number: ");
        int First_number = input.nextInt();
        // System.out.println("Your First Number is "+First_number);
        System.out.print(" Enter the value of Second Number: ");
        int Second_Number= input.nextInt();
        // System.out.println("Your    Second Number is "+Second_Number);

        int c =  First_number + Second_Number;
        System.out.println("The sum of the two numbers are : " + c);
    }
}
