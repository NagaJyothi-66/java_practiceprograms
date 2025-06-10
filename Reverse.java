package jyothi;

public class Reverse {

	public static void main(String[] args) {
		String original = "RUSHIKESH";
		String reversed = new StringBuilder(original).reverse().toString();
		System.out.println(original);
		System.out.println(reversed);
	}
}