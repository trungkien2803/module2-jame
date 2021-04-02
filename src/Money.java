import java.util.Scanner;

public class Money {
    public Money() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mệnh giá vnđ");
        float vnd = sc.nextFloat();
        System.out.println("Tương đương " + vnd / 23000.0F + " Usd");
    }
}