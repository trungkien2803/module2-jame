import java.util.Scanner;

public class Hello {
    public Hello() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What your name?");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }
}
