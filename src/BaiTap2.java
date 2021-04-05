import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int number;
        while (choice != 0){
            System.out.println("1.Kiểm Tra số nguyên tố");
            System.out.println("2.Kiểm Tra số chẵn lẻ");
            System.out.println("3.Kiểm Tra số chính phương");
            System.out.println("0.Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Nhập số cần kiểm tra");
                    number = sc.nextInt();
                    int count = 0;
                    for(int i = 2; i < number;i++){
                        if(number % i == 0){
                            count++;
                        }
                    }
                    if(count == 0){
                        System.out.println("Đây là số nguyên tố");
                    } else {
                        System.out.println("Không phải số nguyên tố");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nhập số cần kiểm tra");
                    number = sc.nextInt();
                    if(number % 2 == 0){
                        System.out.println("Đây là số chẵn");
                    } else {
                        System.out.println("Đây là số lẻ");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Nhập số cần kiểm tra");
                    number = sc.nextInt();
                    double check = Math.floor(Math.sqrt(number));
                    if (check * check == number){
                        System.out.println("Đây là số chính phương");
                    } else {
                        System.out.println("Không phải");
                    }
                    break;
                }
                default: {
                    System.out.println("Không có lựa chọn");
                }
            }
        }
    }
}
