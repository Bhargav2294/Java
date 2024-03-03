import java.util.Scanner;

public class stringfunction {
    public static void main(String[] args) {
        String mypersonal = mymessage("bhargav");
        System.out.println(mypersonal);
    }

    static String mymessage(String name) {
        String message = "namste " + name;
        return message;
    }

    static String message() {
        String message = "namste duniya";
        return message;
    }
}
