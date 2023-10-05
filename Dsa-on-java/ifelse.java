public class ifelse {

    public static void main(String[] args) {
        int number = Integer.parseInt(System.console().readLine("Enter the number: "));

        if (number % 2 == 0) {
            System.out.println("This is divisible by 2");
        } else {
            System.out.println("This is not divisible by 2");
        }
    }
}
