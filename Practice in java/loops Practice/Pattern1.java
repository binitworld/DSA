import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the Square :");
        int size = input.nextInt();

        for (int i=0 ; i <= size ; i++ ){
            for(int j = i; j < size; j++){
                System.out.print("90");

            }
            System.out.println();
        }
    }
}
/* import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the Square :");
        int size = input.nextInt();

        for (int i = 0; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
*/