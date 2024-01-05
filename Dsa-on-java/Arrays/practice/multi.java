// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] sing = new  int[5];

        for (int i = 0; i < sing.length; i++) {
            System.out.print("Enter the number you wanted to store at  " +  (i + 1 ) + " place "+ " : " );
            sing[i]= in.nextInt();

        }

    System.out.println();
    System.out.println("Your Resulted Output will be  : ");
    System.out.println();
    
    System.out.println(Arrays.toString(sing));
}

}