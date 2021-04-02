import java.util.Scanner;

public class RectangleProgram {
    public RectangleProgram() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        float width = sc.nextFloat();
        System.out.println("Nhập chiều rộng");
        float height = sc.nextFloat();
        float area = width * height;
        System.out.println("Area: " + area);
    }
}
