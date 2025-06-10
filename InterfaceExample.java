package jyothi;

import jyothi.Message;
import jyothi.Printable;

interface Printable{
	void print();
}
class Message implements Printable{
	public void print() {
		System.out.println("Hello From INTERFACE");
	}
}
public interface InterfaceExample {
	public static void main(String[] args) {
		Message msg = new Message();
		msg.print();
	}
}

