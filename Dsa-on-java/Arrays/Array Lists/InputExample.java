import java.util.ArrayList;
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> Num = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            Num.add(in.nextInt());
        }

        // Get item at any index
        for (int i = 0; i < args.length; i++) {
            System.out.println(Num.get(i));// Pass index here , List of index ; Syntax will not work here

        }
        System.out.println(Num);
    }
}
