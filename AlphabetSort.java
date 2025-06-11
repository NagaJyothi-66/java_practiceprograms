package jyothi;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSort {
	public static void main(String[] args) {
		Scanner li=new Scanner(System.in);
			System.out.println("Enter the number of strings:");
		int n = li.nextInt();
		li.nextLine();
		String[] strings = new String[n];
		System.out.println("Enter the strings");
		for(int i=0;i<n;i++) {
			strings[i] = li.nextLine();
		}
		
		Arrays.sort(strings);
		System.out.println("\n strings in alphabetical order");
		for(String str :strings) {
			System.out.println(str);
		}
li.close();
	}

}
