import java.util.Arrays;
import java.util.Scanner;

public class String1d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] friends = new String[5];

        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter name of " + (i + 1) + " friend: ");
            friends[i] = in.next();
        }

        System.out.println("\nYour FRIENDS list will look like :-)");
        System.out.println(Arrays.toString(friends));

        System.out.print("Enter the target friend name to find its position in your friend list: ");
        String target = in.next();
        int ans = linearSearch1d(friends, target);

        if (ans == -1) {
            System.out.println("The target name is not found!! So, please try again.");
        } else {
            System.out.println("In your friend list, the name of the target friend is found at index: " + ans);
        }
    }

    static int linearSearch1d(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
