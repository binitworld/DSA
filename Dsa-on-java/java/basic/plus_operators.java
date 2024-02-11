public class plus_operators{
    public static void main(String[]args)
    {
        int num1 =15;
        int num2 =85;

        int result = num1+ num2;
        System.out.println("The sum of  " + num1 + " + "+ num2+" = " + result);

        num2 += 5;

        System.out.println("Example of += operator :"+num2);

        num2 -=5;

        System.out.println("-= operator :"+num2);
        
        num1 *= 8;

        System.out.println("The example of *+ operator :" + num1);
        
        num2++;

        System.out.println("The increment operator ++ :"+num2);

        num1--;

        System.out.println("The decrement Operator -- : " +num1);
        
    }
}