package jyothi;

import jyothi.Car;
import jyothi.DailyPractice;

abstract class Car {
    abstract void start();
    abstract void drive();
    abstract void stop();

    void musicSystem() {
        System.out.println("Playing Music");
    }
}

class DailyPractice extends Car {
    void start() {
        System.out.println("Car Started Using Start Button");
    }

    void drive() {
        System.out.println("Car is Driving");
    }

    void stop() {
        System.out.println("Car Stopped");
    }
}

public class DrivingCar {
    public static void main(String[] args) {
        DailyPractice myCar = new DailyPractice();
        myCar.start();
        myCar.drive();
        myCar.musicSystem();
        myCar.stop();
    }
}
