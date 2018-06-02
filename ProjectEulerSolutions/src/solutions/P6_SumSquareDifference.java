package solutions;

import java.math.BigInteger;

/* *
 * Solution for Problem 6
 * Sum Square Difference
 * link: https://projecteuler.net/problem=6
 * 
 * @author: Rehan
 * */

public class P6_SumSquareDifference {

	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		
		BigInteger sum=BigInteger.ZERO;
		BigInteger ssum=BigInteger.ZERO;
		
		for(int i=1;i<=100;i++)
		{
			int temp=(int) Math.pow(i, 2);
			sum=sum.add(BigInteger.valueOf(i));
			ssum=ssum.add(BigInteger.valueOf(temp));
		}
		System.out.println("Sum of squares = "+ssum);
		BigInteger b=sum.pow(2);
		System.out.println("Square of sum = "+b);
		System.out.println("Difference between the two = "+(b.subtract(ssum)));
		
		long end=System.currentTimeMillis();
		long elapsedTime = end - start;
		System.out.println("\nTime taken for the execution : "+elapsedTime+" ms");
	}
}