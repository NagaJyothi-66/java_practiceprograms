package jyothi;

import jyothi.Calculator;

class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class OverloadingExample {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(1, 2));
		System.out.println(c.add(1.5, 2.5));
		System.out.println(c.add(1,2,3));

	}

}

