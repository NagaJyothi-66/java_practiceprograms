package jyothi;

public class ConstantTimeExample {
	public static void printFirstElement(int[] arr) {
		if(arr.length > 0) {
			System.out.println("First element is:" + arr[0]);
		}else {
			System.out.println("Array is Empty.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,20,30,40,50,60,70,80,90,100,160,123,46,789,741,41,23,6,98,753,66};
		printFirstElement(numbers);

	}

}
