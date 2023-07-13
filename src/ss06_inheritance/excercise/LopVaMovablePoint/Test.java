package ss06_inheritance.excercise.LopVaMovablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.setXY(10.0f, 20.0f);
        movablePoint.setSpeed(1.0f, 1.2f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}

