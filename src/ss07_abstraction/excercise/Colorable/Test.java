package ss07_abstraction.excercise.Colorable;

import ss07_abstraction.excercise.Resizeable.Shape;
import ss07_abstraction.excercise.Resizeable.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0] = new Square(5);
        for (Shape shape: shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable){
                Square square = (Square) shape;
                System.out.println(square.getArea());
                square.howToColor();
            }
        }
    }
}
