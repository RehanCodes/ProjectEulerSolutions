/**
 * 
 */
package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* *
 * Solution for Problem 3
 * largest prime factor
 * link: https://projecteuler.net/problem=3
 * 
 * @author: Rehan
 * */
public class P3_LargestPrimeFactor {

	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		
		long n=600851475143L;
		List<Long> lst=new ArrayList<Long>();
		for (long i = 2; i <= n; i++)
		{
			if (n % i==0)
			{
				System.out.println(i);
				lst.add(i);
				n = n / i;
				i = 2;
			}
		}
		System.out.println("The largest Prime factor of the given number = "+Collections.max(lst));
		
		long end=System.currentTimeMillis();
		long elapsedTime = end - start;
		System.out.println("\nTime taken for the execution : "+elapsedTime+" ms");
	}
}
