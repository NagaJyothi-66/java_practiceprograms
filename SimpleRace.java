package jyothi;

import jyothi.Bike;
import jyothi.car;
class car implements Runnable {
	public void run(){
		for (int i=1;i<=3;i++) {
			System.out.println(" BWM car moving" + i);
			try {
	             Thread.sleep(500); 
	         } catch (Exception e) {
	             
	         }
		}
	}
}
class Bike implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(" ninija bike moving" + i);
			try {
	             Thread.sleep(500); 
	         } catch (Exception e) {
	             
	        	 
	         }
		}
	}
}
public class SimpleRace {

	public static void main(String[] args) {
		Thread  t1 = new Thread(new car());
		Thread  t2 = new Thread(new Bike());
		System.out.println("Gooo");
		t1.start();
		t2.start();
	}

}
