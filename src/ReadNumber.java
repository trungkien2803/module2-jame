import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number");
        int number = sc.nextInt();
        int donvi = number % 10;
        int chuc = number  / 10;
        int trăm = number / 100;
        String[] word = {"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
        if (number >= 0 && number < 10) {
            System.out.println(word[number]);
        } else if (number > 10 && number < 20){
            System.out.println("Mười " + word[donvi]);
        } else if(number == 10){
            System.out.println("Mười");
        } else if (number > 20 && number < 100){
            System.out.println(word[chuc] + " mươi "+ word[donvi]);
        }
    }
}
