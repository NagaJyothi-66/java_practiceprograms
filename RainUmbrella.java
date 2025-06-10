package jyothi;

import java.util.Scanner;

public class RainUmbrella {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("it is raining(YES/NO)");
		String answer=sc.next();
		if(answer.equals("yes")) {
			System.out.println("take an Umbrella");
		}else {
			System.out.println("no need of an umbrella");
		}
		

	}

}
