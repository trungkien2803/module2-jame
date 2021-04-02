import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng (kg)");
        double weight = sc.nextDouble();
        System.out.println("Nhập chiều cao (m)");
        double height = sc.nextDouble();
        double bmi = weight / Math.pow(height, 2.0D);
        if (bmi < 18.0D) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25.0D) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30.0D) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }

    }
}

