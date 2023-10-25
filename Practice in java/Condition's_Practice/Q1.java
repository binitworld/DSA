// Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter the number :");
        int a = input.nextInt();

        if (a >=0){
            System.out.println(" It is a positive number");
        }
        else if (a<0){
            System.out.println("It is a negative number");
            
        }
        else{
            System.out.println("Give a correct Input integer value");
        }
    }
}
