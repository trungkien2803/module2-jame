import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Năm " + year + " Là năm nhuận");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Năm " + year + " Là năm nhuận");
        } else {
            System.out.println("Năm " + year + " Không phải năm nhuận");
        }

    }
}
    