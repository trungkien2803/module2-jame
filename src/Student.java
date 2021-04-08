import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String birthDate;
    private double mark;

    public Student(int id, String name, String birthDate, double mark) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.birthDate = dateOfBirth;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    static void input(Student students[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++){
            int id = sc.nextInt();
            String name = sc.next();
            String dateOfBirth = sc.next();
            double mark = sc.nextDouble();
            students[i] = new Student(id,name,dateOfBirth,mark);
        }
    }
    static void output(Student students[]){
        for(Student element : students){
            System.out.printf("%-15s%-25s%-15s%-15s\n",element.getId(),element.getName(),element.getBirthDate(),element.getMark());
        }
    }
    static void push(Student students[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên cần thêm vào");
        int amount = sc.nextInt();
        Student newStudents[] = new Student[students.length + amount];
        for (int i = 0; i < newStudents.length; i++){
            if(i >= students.length){
                int id = sc.nextInt();
                String name = sc.next();
                String dateOfBirth = sc.next();
                double mark = sc.nextInt();
                newStudents[i] = new Student(id,name,dateOfBirth,mark);
            }
            newStudents[i] = students[i];
        }
        output(newStudents);
    }
    static void fix(Student students[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = sc.nextInt();
        for (int i = 0; i < students.length; i++){
            if (id == students[i].getId()){
                int id2 = sc.nextInt();
                String name = sc.next();
                String birthDate = sc.next();
                double mark = sc.nextDouble();
                students[i].setId(id2);
                students[i].setName(name);
                students[i].setDateOfBirth(birthDate);
                students[i].setMark(mark);
            }
        }
        output(students);
    }


    static void delete(Student students[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = sc.nextInt();
        Student newStudents[] = new Student[students.length];
        for (int i = 0; i < students.length; i++){
            if(students[i].getId() == id){
                continue;
            }
            newStudents[i] = students[i] ;
        }
        output(newStudents);
    }
    static void findMark(Student students[]){
        double max = students[0].getMark();
        int index = 0;
        for (int i = 0; i < students.length; i++){
            if(max < students[i].getMark()){
                index = i;
            }
        }
        System.out.println("Sinh viên có điểm cao nhất là");

        System.out.printf("%-15s", students[index]);

    }
    static void sort(Student students[]){
        for (int i = 0; i < students.length; i++){
            for(int j = i+1; j<students.length;j++){
                if(students[i].getMark() < students[j].getMark()){
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        output(students);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên");
        int count = 0;
        int amount = sc.nextInt();
        Student students[] = new Student[amount ];
        input(students);
        output(students);
        sort(students);
    }
}
