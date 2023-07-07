package ss04_class_object_java.excercise;

import java.util.Scanner;

public class StopWatch {
    double startTime, endTime;

    private StopWatch() {
    }

    private StopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void end() {
        this.endTime = System.currentTimeMillis();
    }

    double getElapsedTime() {
        return this.endTime - this.startTime;
    }

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
