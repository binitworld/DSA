// Q3. Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of First number:");
        int a = input.nextInt();
        System.out.print("Enter the value of Second number:");
        int b = input.nextInt();
        System.out.print("Enter the value of Third number:");
        int c = input.nextInt();

        int great = a ;
        
        if (b > great){
        great=b;

        }
        if (c > great ){
            great =c;
        }
        System.out.println(" The Greater Number is : "+great);
    }
    
}
