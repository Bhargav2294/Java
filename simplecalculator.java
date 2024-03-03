import java.util.Scanner;

public class simplecalculator {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("enter number 1:");
        int a = input.nextInt();

        System.out.print("enter number 2:");
        int b = input.nextInt();

        
    System.out.println("a + b = " + (a + b));

    System.out.println("a - b = " + (a - b));

    System.out.println("a * b = " + (a * b));

    System.out.println("a / b = " + (a / b));

    System.out.println("a % b = " +(a%b));

    input.close();

    }
    
}
