package ss06_inheritance.excercise.LopVaMovablePoint;

public class MovablePoint extends Point {

    private float xSpeed;
    private float ySpeed;

    protected MovablePoint() {

    }

    protected MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float array[] = {xSpeed, ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ", x=" + x + ", y=" + y + '}';
    }

    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
