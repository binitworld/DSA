import java.util.Scanner;

public class whilleloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a =input.nextInt();

        System.out.println("The multiplication Table of  " + a + " is ");
        int i =0;
        while (i <=10) {
            System.out.println(a + " * " + i + " = " + a*i);
            i ++ ;
            
        }
    }   
}
