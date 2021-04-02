import java.util.Scanner;

public class BaiTap {
    static void checkNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println("Đây là số nguyên dương");
        } else {
            System.out.println("Đây là số nguyên âm");
        }
    }

    ;

    static void checkEdge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        float a = sc.nextFloat();
        System.out.println("b");
        float b = sc.nextFloat();
        System.out.println("c");
        float c = sc.nextFloat();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("a,b,c là 3 cạnh tam giác");
        } else {
            System.out.println("a,b,c không phải 3 cạnh tam giác");
        }
    }

    static void checkEdge2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        double a = Math.pow(sc.nextDouble(), 2);
        System.out.println("b");
        double b = Math.pow(sc.nextDouble(), 2);
        System.out.println("c");
        double c = Math.pow(sc.nextDouble(), 2);

        if (a == b + c || b == a + c || c == a + b) {
            System.out.println("a,b,c là 3 cạnh tam giác vuông");
        } else {
            System.out.println("a,b,c không phải 3 cạnh tam giác vuông");
        }
    }

    static void fizzBuzz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number");
        float number = sc.nextFloat();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if (number % 3 == 0) {
            System.out.println("FIZZ");
        } else if (number % 5 == 0) {
            System.out.println("BUZZ");
        }
    }

    static void readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số");
        int number = sc.nextInt();
        String[] word = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if (number >= 0 && number < 10) {
            System.out.println(word[number]);
        }

    }

    public static void main(String[] args) {
        
    }
}