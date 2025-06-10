package jyothi;

import jyothi.Cars;
import jyothi.DriverCar;

abstract class Cars {
 abstract void start();
 abstract void steer(String direction);
 abstract void accelerate();
 abstract void brake();
 abstract void honk();
 abstract void stop();
}

class DriverCar extends Cars {

 void start() {
     System.out.println("Car started using the ignition key.");
 }
 
 void steer(String direction) {
     System.out.println("Steering the car to the " + direction + ".");
 }

 void accelerate() {
     System.out.println("Pressing the accelerator to speed up.");
 }
 void brake() {
     System.out.println("Pressing the brake to slow down.");
 }
 void honk() {
     System.out.println("Honking the horn.");
 }

 void stop() {
     System.out.println("Car has been stopped.");
 }
}
public class AbstractCarEx {
 public static void main(String[] args) {
     Cars myCar = new DriverCar();

     myCar.start();
     myCar.accelerate();
     myCar.steer("left");
     myCar.brake();
     myCar.honk();
     myCar.stop();
 }
}