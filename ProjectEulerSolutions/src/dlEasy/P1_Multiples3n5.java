package dlEasy;

/* *
 * Solution for Problem 1
 * sum of multiples of 3 and 5 below 1000
 * link: https://projecteuler.net/problem=1
 * 
 * @author: Rehan
 * */

public class P1_Multiples3n5 {

	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=1;i<1000;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
			else if(i%5==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum of the multiples of 3 and 5 below 1000 = "+sum);
	}
}
