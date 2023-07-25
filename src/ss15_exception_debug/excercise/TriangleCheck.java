package ss15_exception_debug.excercise;

public class TriangleCheck {


    public static void triangle(double a, double b, double c) throws TriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new TriangleException("side of triangle must be > 0, try again");
        } else if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new TriangleException("sumary of 2 side must be > another one, try again");
        } else {
            System.out.println("Yeahhhhh bro,Triangle abc with 3 side: a = " + a + " ; b = " + b + " ; c = " + c);
        }
    }
}


