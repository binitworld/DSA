import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input =new  Scanner(System.in);

        System.out.print("Enter the First Number:");
        int a= input.nextInt();

        System.out.print("Enter the Second Number:");
        int b = input.nextInt();


        int x = a/b;
        System.out.println("The Division of First number by second is: " + x);
    }
    
}
