package main.java;

/*for big numbers we have to calculate fibonacci at O(logN). One of the method is using matrix: 
[1 1]^n		[Fn+1 Fn  ]
[1 0]   = 	[Fn   Fn-1]

we put fibonacci number in a vector = [f(n), f(n-1) ]. Matrice M * vector = vector1, wgich vector1 = [f(n+1), f(n)]. f(n+1) fibonaci number is the first element and the second 
element is f(n) from previous vector.
f(0) = 0
f(1) = 1
f(n) = f(n-1) + f(n-2)
f(n+1) = f(n) + f(n-1)
*/
import java.math.BigInteger;

public class FibonacciBigInteger {

	public static void main(String[] args) {
		
		//BigInteger M[][] = new BigInteger[][]{{BigInteger.ONE,BigInteger.ONE},{BigInteger.ONE,BigInteger.ZERO}};
		
	    }
	        
		//System.out.println("Fib("+n+") = "+M[0][1]);
		
	
		private static void fib(float M[][], float n)
		{
			if(n==1)
				return;
			float M1[][] = {{1,1},{1,0}};
			fib(M, n/2);
			matsquare(M,M);
			
			if(n%2!=0)
			matsquare(M,M1);	
		}
	private static void matsquare(float M[][], float M1[][])
	{
		float x=M[0][0]*M1[0][0]+M[0][1]*M1[1][0]; 
		float y=M[0][0]*M1[0][1]+M[0][1]*M1[1][1]; 
		float z=M[1][0]*M1[0][0]+M[1][1]*M1[1][0]; 
		float w=M[1][0]*M1[0][1]+M[1][1]*M1[1][1]; 

		M[0][0]=x; 
		M[0][1]=y; 
		M[1][0]=z; 
		M[1][1]=w; 
	}
		/*
	BigInteger low  = BigInteger.ONE;    
	BigInteger high = BigInteger.ONE;   
	
	int n = 1000;
	
	for (int i = 1; i <= n; i++) 
	{     
		System.out.println(low);      
		BigInteger temp = high;      
		high = high.add(low);     
		low = temp;
		//System.out.println("i = " + i + " fib[i] = " + i);
	}*/
	
	}


