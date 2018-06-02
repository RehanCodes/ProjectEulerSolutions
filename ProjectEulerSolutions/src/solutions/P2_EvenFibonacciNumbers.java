package solutions;

/* *
 * Solution for Problem 2
 * sum of the Even Fibonacci numbers
 * link: https://projecteuler.net/problem=2
 * 
 * @author: Rehan
 * */

public class P2_EvenFibonacciNumbers {

	public static void main(String[] args) 
	{
		int i=1,j=2;
		int sum=0;
		int evenValuedSum=0;
		int counter=2;
		
		System.out.print(i+" ");
		System.out.print(j+" ");
		for(int k=1;k<50;k++)
		{
			sum=i+j;
			counter++;
			if(sum<4000000)
			{
				if(sum%2==0)
				{
					evenValuedSum+=sum;
				}
			}
			else
			{
				System.out.println("\n\nNo of Fibonacci terms generated till now = "+counter);
				break;
			}
			System.out.print(sum+" ");
			i=j;
			j=sum;
		}
		System.out.println("\nSum of the even terms of the Fibonacci series = "+(evenValuedSum+2));
	}
}
