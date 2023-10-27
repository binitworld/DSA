import java.util.Scanner;

public class W1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number till You want to print :");
        int a = input.nextInt();

        int i = 1;
        while (i<=a) {
            System.out.println(i);
            i++;
            
        }
    }    
}
