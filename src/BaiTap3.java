import java.util.Scanner;

public class BaiTap3 {
    static void input(String arr[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("Nhập thông tin sinh viên " +(i+1));
            for (int j = 0; j < 4; j++){
                arr[i][j]= sc.next();
            }
        }
    }
    static void output(String arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < 4; j++){
                System.out.printf("%s   ",arr[i][j]);
            }
            System.out.println();
        }
    }
    static void push(String arr[][]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên cần thêm vào");
        int amount = sc.nextInt();
        String newArray[][] = new String[arr.length + amount][4];
        for (int i = 0; i < newArray.length; i++){
            for (int j = 0; j < 4; j++){
                if(i >= arr.length){
                    newArray[i][j] = sc.next();
                    continue;
                }
                newArray[i][j] = arr[i][j];
            }
        }
        output(newArray);

    }
    static void fix(String arr[][]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        String id = sc.next();
        String newArray[][] = new String[arr.length -1][4];
        System.out.println("Nhập thông tin chỉnh sửa");
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < 4; j++){
                if (id.equals(arr[i][1])){
                    continue;
                }
                newArray[i][j] = arr[i][j];
            }
        }
        output(newArray);
    }
    static void delete(String arr[][]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        String id = sc.next();
        for (int i = 0; i < arr.length; i++){
            if(arr[i][0].equals(id)){
                for (int j = 0; j < 4; j++){
                    arr[i][j] = sc.next();
                }
            }
        }
        output(arr);
    }
    static void findMark(String arr[][]){
        int max = Integer.parseInt(arr[0][3]);
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if(max < Integer.parseInt(arr[i][3])){
                max = Integer.parseInt(arr[i][3]);
                index = i;
            }
        }
        System.out.println("Sinh viên có điểm cao nhất là");
        for(int i = 0; i < arr[index].length;i++){
            System.out.printf("%s    ", arr[index][i]);
        }
    }
    static void sort(String arr[][]){
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                if(Integer.parseInt(arr[i][3]) < Integer.parseInt(arr[j][3])){
                    String temp[] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        output(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên");
        int amount = sc.nextInt();
        String arr[][] = new String[amount][4];
        input(arr);
        sort(arr);
    }
}
