package jyothi;

import java.util.TreeSet;

public class BooktreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> bookIds= new TreeSet<>();
		bookIds.add(5002);
		bookIds.add(4998);
		bookIds.add(5005);
		bookIds.add(4999);
		bookIds.add(5001);
		System.out.println(bookIds);
		System.out.println(bookIds.first());
		System.out.println(bookIds.last());
		System.out.println(bookIds.higher(4999));
		System.out.println(bookIds.lower(5005));
	}

}
