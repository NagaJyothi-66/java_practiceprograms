package jyothi;

import jyothi.Animals;
import jyothi.Cats;
import jyothi.Dogs;

class Animals{
	void sound() {
		System.out.println("Animals make sound");
	}
}
class Dogs extends Animals{
	void sound() {
		System.out.println("Dog Barks");
	}
}
class Cats extends Animals{
	void sound() {
		System.out.println("Cat Meows");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		Animals a1 = new Animals();
		Animals a2 = new Dogs();
		Animals a3 = new Cats();
		a1.sound();
		a2.sound();
		a3.sound();
	}

}
