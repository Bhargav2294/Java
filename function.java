import java.util.Scanner;

public class function {
    //
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = input.nextInt();
        System.out.println("enter number 2:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
        // System.out.println("sum is:" + sum2);
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = input.nextInt();
        System.out.println("enter number 2:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is:" + sum);
    }

    public static void main(String[] args) {
        // int ans = sum2();
        // System.out.println(ans);
        int ans = sum3(20, 30);
        System.out.println(ans);
    }
}
