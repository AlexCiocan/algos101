package main.java;

import java.util.Scanner;

/*Fibonacci number calculations, the fibonacci sequence starts with value '0' and '1', and every subsequent value
 * is the 'sum' of the two previous values. Results in an exponential algorithm, impractical for large values of n.
 *  
 * Ex: fib 0 = 0, 
 * 	   fib 1 = 1,
 * 	   fib 2 = 0 + 1,
 * 	   fib 3 = 1 + 2,
 * 	   ..
 * 	   fn = f(n-1) + f(n-2)
 * 
 * 
 * Fibonacci iterative and recursive.
 * A recursive function is using decision constructs( if/else ) and repeatedly calls itself. Using one method called several different times in order to produce a single output.
 * A recursive method push the current computation state into the stack before recursively calling itself.  
 */
public class FibonacciRec {

	// f is cached values
	private static long[] f = new long[100];// using static variable reduces the processing time
	
	public static void main(String[] args) 
	{
		int n = 90;
		
		for(int i  = 0; i <= n; i++)
		{
			System.out.println("fib(" + i + ") = " + " " + fib(i));
		}
		
	}
	public static long fib(int n)
	{
		//long[] f = new long[90]; -> if we are using an array, the processing time is to slow
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		if(f[n] > 0)
			return f[n];// return cached value
		f[n] = fib(n-1) + fib(n-2);//compute & cached value
			return f[n];
	}
}
