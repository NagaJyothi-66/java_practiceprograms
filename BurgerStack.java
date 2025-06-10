package jyothi;
import java.util.Stack;

public class BurgerStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> burgerstack = new Stack<String>();
		burgerstack.push("Burger 1");
		burgerstack.push("Burger 2");
		burgerstack.push("Burger 3");
		System.out.println("Top burger is " + burgerstack.peek());
		System.out.println("Serving" + burgerstack.pop());
		if(burgerstack.isEmpty()) {
			System.out.println("All burgers are served");
		}
	}
}