import java.util.Scanner;

public class Ifcondition{
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Your Current Salary:");
        int salary = input.nextInt();

        if(salary<=1000000){
            System.out.println("You are a looser ,You have to work on it ..");
        }
        else if(salary>=1000000){
            System.out.println("Yah! You achieved it So, now Work hard to get more ..");

        }
        else{
            System.out.println("You are the one who will achieve it!! ");
        }
    }
}