package ss06_inheritance.excercise.CircleCylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinderOne = new Cylinder(30, "blue", 10);
        cylinderOne.setHeight(20);
        cylinderOne.getVolume();
        System.out.println(cylinderOne);
    }
}
