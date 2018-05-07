package main.java;

/*
 * A iterative function is using looping constructs( while/for ) and repeatedly executes the loop
 */
public class FibonacciIterativ{

	public static void main(String[] args) {
		
		int n0 = 0;
		int n1 = 1,n2;
		System.out.println(n0 + "\n" + n1);
		
		for(int i = 0; i < 20; i++)
		{
		n2 = n1 + n0;
		System.out.println(n2 + " ");
		
		n0 = n1;
		n1 = n2;
	}
		System.out.println();
}
}