package jyothi;

public class QuadraticTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,5,7,2};
		boolean hasDuplicate = false;
		for(int i =0;i < numbers.length;i++) {
			for(int j = i+1;j<numbers.length;j++) {
				if(numbers[i] == numbers[j]) {
					hasDuplicate =true;
					System.out.println("Duplicate found:"+numbers[i]);
				}
			}
		}
		if(!hasDuplicate) {
			System.out.println("No duplicate found.");
		}
	}

}
