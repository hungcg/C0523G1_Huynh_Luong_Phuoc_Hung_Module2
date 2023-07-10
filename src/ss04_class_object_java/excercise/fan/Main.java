package ss04_class_object_java.excercise.fan;

public class Main {
    public static void main(String[] args) {
        Fan fanOne = new Fan();
        Fan fanTwo = new Fan();
        fanTwo.setOn(true);
        fanTwo.setSpeed(Fan.FAST);
        fanTwo.setRadius(30);
        fanTwo.setColor("green");
        fanOne.setOn(false);
        System.out.println(fanTwo);
        System.out.println(fanOne);
    }
}
