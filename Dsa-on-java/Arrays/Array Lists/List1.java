import java.util.ArrayList;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(7);
        for (int i = 0; i < args.length; i++) {
            list.add(in.nextInt(), null);

        }
    }

}
