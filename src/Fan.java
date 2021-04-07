public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed = slow;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    Fan() {

    }


    Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.status) {
            return "speed = " + speed +
                    ", radius = " + radius +
                    ", color = " + color + "Fan is on";
        } else {
            return " radius = " + radius +
                    ", color = " + color + " Fan is off";
        }

    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setStatus(true);
        fan.setSpeed(fan.medium);
        System.out.println(fan);
    }
}
