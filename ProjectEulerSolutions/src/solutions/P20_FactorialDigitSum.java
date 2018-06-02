package solutions;

import java.math.BigInteger;

/* *
 * Solution for Problem 20
 * Factorial Digit Sum
 * link: https://projecteuler.net/problem=20
 * 
 * @author: Rehan
 * */

public class P20_FactorialDigitSum {
	
	static BigInteger b=new BigInteger("1");
	static long mulplicationFactor=1l;
	static int sum=0;

	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		for(int i=100;i>=1;i--)
		{
			b=b.multiply(BigInteger.valueOf(i));
		}
		System.out.println("100! = "+b);
		String str=String.valueOf(b);
		System.out.println("Number of digits in 100! = "+str.length());
		char arr[]=str.toCharArray();
		for (char c : arr) {
			String str2=String.valueOf(c);
			int temp=Integer.parseInt(str2);
			sum=sum+temp;
		}
		System.out.println("Sum of the digits of 100! = "+sum);
		
		long end=System.currentTimeMillis();
		long elapsedTime = end - start;
		System.out.println("\nTime taken for the execution : "+elapsedTime+" ms");
	}
}
// Kindly suggest a way, if possible, to convert a char directly to an integer.
