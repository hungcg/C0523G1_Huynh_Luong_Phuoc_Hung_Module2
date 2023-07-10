package ss04_class_object_java.excercise.stopwatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch rolex = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("the time running");
        rolex.start();
        System.out.println("Type stop");
        String stop = scanner.nextLine();
        rolex.end();
        System.out.println("time has run= " + rolex.getElapsedTime() + "ms");
    }
}
