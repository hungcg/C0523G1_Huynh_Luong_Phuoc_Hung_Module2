package ss04_class_object_java.excercise;

public class Fan {
    private static final int slow = 1;
    private static final int medium = 2;
    private static final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    private Fan() {
    }

    private Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;

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

    public String toString() {
        if (getOn()) {
            return "Speed= " + speed + " - color= " + color + " -radius= " + radius + " - Fan is on";
        } else {
            return "Fan is Off";
        }
    }

    public static void main(String[] args) {
        Fan fanOne = new Fan(fast, true, 30, "blue");
        Fan fanTwo = new Fan(medium, true, 50, "red");
        System.out.println(fanTwo);
        System.out.println(fanOne);
    }
}
