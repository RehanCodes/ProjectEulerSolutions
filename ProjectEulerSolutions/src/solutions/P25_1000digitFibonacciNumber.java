package solutions;

/* *
 * Solution for Problem 25
 * 1000 digit Fibonacci Number
 * link: https://projecteuler.net/problem=25
 * 
 * @author: Rehan
 * */

import java.math.BigInteger;

public class P25_1000digitFibonacciNumber {

	public static void main(String[] args) 
	{
		BigInteger i=BigInteger.ZERO;
		BigInteger j=BigInteger.ONE;
		BigInteger sum=BigInteger.ZERO;
		int counter=1;
		
		System.out.println(j);
		for(int k=1;k<=5000;k++)
		{
			sum=i.add(j);
			counter++;
			System.out.println(sum);
			
			if(String.valueOf(sum).length()==1000)
			{
				System.out.println("FOUND!! the 1000 digit Fibonacci number = "+sum+" | At INDEX : "+counter);
				break;
			}
			i=j;
			j=sum;
		}
	}
}
