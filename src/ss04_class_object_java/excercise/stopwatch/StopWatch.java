package ss04_class_object_java.excercise.stopwatch;

import java.util.Scanner;

public class StopWatch {
    double startTime;
    double endTime;

    public StopWatch() {
    }

    public StopWatch(double startTime, double endTime) {
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

}
