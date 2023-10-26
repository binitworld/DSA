import java.util.Scanner;

public class Table_InReverse {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter the number to get its Reverse order multiplication =");
        int n = input.nextInt();
        
        System.out.println("The Reverse Order of the Given number" + n  + " is ");
        for (int i = 10; i >=1; i --){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }

    
}
