import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        float a = sc.nextFloat();
        System.out.println("Nhập b");
        float b = sc.nextFloat();
        if (a != 0.0F) {
            float x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }

        if (a == 0.0F) {
            if (b == 0.0F) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }

    }
}
