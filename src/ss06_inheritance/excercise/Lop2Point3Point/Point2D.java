package ss06_inheritance.excercise.Lop2Point3Point;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;

    protected Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    protected Point2D() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float array[] = {x, y};
        return array;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" + "x=" + x + ", y=" + y + '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
    }
}
