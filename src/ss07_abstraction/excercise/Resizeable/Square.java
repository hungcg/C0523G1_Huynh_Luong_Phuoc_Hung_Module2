package ss07_abstraction.excercise.Resizeable;

public class Square extends Rectangle {
    private double side;

    public Square() {
        this.side = 1;

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (side * side);
    }

    public double getPerimeter() {
        return (side * 4);
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

    @Override
    public void resize(double percent) {
        setSide(this.side += percent);
    }
}
