import java.util.Scanner;

public class Even_numbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.print(" Enter the number which you have to print: ");
        int n = input.nextInt();

        System.out.println("The List of even number  is :");
        for(int i = 0 ; i < n; i+=1){
            if (i % 2 ==0){
                System.out.println(i);
            }
        }
    }
    
}
