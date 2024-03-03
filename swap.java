import java.util.Scanner;

public class swap {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void changename(String name) {
        name = "raj patel";
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "bhargav sangani";
        changename(name);
        System.out.println(name);

    }
}
// in array we point to original array not to copy of object