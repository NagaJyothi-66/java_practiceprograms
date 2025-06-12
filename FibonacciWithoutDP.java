package jyothi;

public class FibonacciWithoutDP {
	public static int fib (int n) {
		if(n<=1)
			return n;
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println("Fibonacci of" + n + "is :" +fib(n));
	}

}
