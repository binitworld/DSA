import java.util.Scanner;

public class  multiplication_Table{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to get its multiplication Table :");
        int n = input.nextInt();

        for (int i = 1 ; i <= 10 ;  i ++ ){
            System.out.println("The multiplication is "+ n +" * " + i + " = " + n * i);

        }

    }
}