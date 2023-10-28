import java.util.Scanner;

public class W4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter the Alphabet  you want to print:");
        char end ='A';
        
        System.out.print("Enter the Alphabet till you want to print:");
        char start = input.next().charAt(0);

        System.out.println("The reverse order of the alphabet is : ");

        char i = start;
        // char x = end;

        while (i>end) {
            System.out.println(i);
            i--;

            
        }
    }
    
}
