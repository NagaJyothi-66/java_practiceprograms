package jyothi;

import java.util.HashMap;

public class FibonacciWithDP {
	static HashMap<Integer,Integer>  memo = new HashMap<Integer,Integer>();
	public static int fib(int n) {
		if(n <=1) {
			return n;
		}
	if (memo.containsKey(n)) {
		return memo.get(n);
	}
	int result = fib(n -1)+fib(n - 2);
	memo.put(n, result);
	return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println("Fibonacci of"+ n + " is "+fib(n));
	}

}
