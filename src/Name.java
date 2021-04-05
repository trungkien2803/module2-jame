import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if(name.equals(students[i])){
                System.out.println(i);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Không tìm thấy");
        }

    }
}
