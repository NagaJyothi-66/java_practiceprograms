package jyothi;

import java.util.Scanner;
public class InputExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter the Age :");
		int age =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name");
		String name = sc.nextLine();
		System.out.println(name+age);
	}

}
