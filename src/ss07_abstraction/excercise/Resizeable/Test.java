package ss07_abstraction.excercise.Resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(7, 9);
        shapes[2] = new Square(8);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                System.out.println("Area Circle: ");
                System.out.println(((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Area Rectangle: ");
                System.out.println(((Rectangle) shape).getArea());
            }
            if (shape instanceof Square) {
                System.out.println("Area Square: ");
                System.out.println(((Square) shape).getArea());
            }
        }
        double random = Math.random() * 100;
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                ((Circle) shape).resize(random);
                System.out.println("Area Circle: ");
                System.out.println(((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(random);
                System.out.println("Area Rectangle: ");
                System.out.println(((Rectangle) shape).getArea());
            }
            if (shape instanceof Square) {
                ((Square) shape).resize(random);
                System.out.println("Area Square: ");
                System.out.println(((Square) shape).getArea());
            }
        }
    }
}
