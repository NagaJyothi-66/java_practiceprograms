package jyothi;

public class Backtracking {

	public static void makewords(String current,String letters) {
		if(current.length()==3) {
			System.out.println(current);
			return;
		}
		for(int i=0;i<letters.length();i++) {
			makewords(current + letters.charAt(i),letters);
		}
	}
		
public static void main(String[] args) {
	makewords(" ","ABC");
}
	}

