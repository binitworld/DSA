// Write a Java program to solve quadratic equations (use if, else if and else).

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter the Coefficient of X^2 :");
        double a = input.nextDouble();
        System.out.print(" Enter the Coefficient of X :");
        double b = input.nextDouble();
        System.out.print(" Enter the Constant term :");
        double c = input.nextDouble();

        double discriminant = b*b-4*a*c;

        if (discriminant>0){
            double Root1 =(-b+Math.sqrt(discriminant)/(2*a));
            double Root2 =(-b+Math.sqrt(discriminant)/(2*a));

            System.out.println("The first root of the quadratic equation is :" + Root1 + "The second root of the quadratic equation is : " +Root2);


        }
        else if (discriminant == 0){

            double root = -b/(2*a);
            System.out.println("the root of this equation is : "+root);
        }
        else{
            System.out.println("Enter the Correct values / It have two complex roots");
        }


    }
    
}
