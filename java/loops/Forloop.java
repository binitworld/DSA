import java.util.Scanner;

public class Forloop{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter the number:");
        int num = input.nextInt();
            for(int i=0; i<=num; i++ ){
                System.out.println(" Your result is :" + i);
            }

    }
}