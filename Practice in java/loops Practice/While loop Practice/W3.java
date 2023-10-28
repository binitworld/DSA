import java.util.Scanner;

public class W3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the  Alphabet:");
        char x = input.next().charAt(0);

        char i = 'A';
        while (i<=x)  {
            System.out.println(i);
            i++;
            
        }




    }    
}
