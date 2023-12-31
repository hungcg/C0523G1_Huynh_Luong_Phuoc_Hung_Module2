package ss06_inheritance.excercise.Lop2Point3Point;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    protected Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    protected Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float array[] = {x, y, z};
        return array;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" + "z=" + z + ", x=" + x + ", y=" + y + ", array 3D= " + Arrays.toString(getXYZ()) + "}";
    }
}
