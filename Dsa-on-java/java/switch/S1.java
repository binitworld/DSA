import java.util.Scanner;

public class S1{
    public static void main(String[] args) {
        
        Scanner  input = new Scanner (System.in);
        System.out.print("Enter the fruit nae :");
        String  fruits = input.next();

        // if (fruits.equals("mango")){
        //     System.out.println("King of Fruit always tasty!");
        // }

        // if (fruits.equal("Apple")){
        //     System.out.println("This is in red color!");
        // }
        switch (fruits) {
            case "Mango":
                System.out.println("King of Fruit always tasty!");
                
                break;
            case "Apple":
                System.out.println("This is in red color!");
                
                break;
            case "Kiwi":
                System.out.println("Good for Health!");
                
                break;
        
            default:
                break;
        }




    }
}