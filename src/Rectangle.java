import java.lang.reflect.Constructor;

public class Rectangle {
    double width;
    double height;

    Rectangle() {

    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        double area = this.width * this.height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (this.width + this.height) * 2;
        return perimeter;
    }

    public void draw() {
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
    public void display(){
        System.out.println("Area = " + this.getArea());
        System.out.println("Perimeter = " + this.getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);
    }
}
