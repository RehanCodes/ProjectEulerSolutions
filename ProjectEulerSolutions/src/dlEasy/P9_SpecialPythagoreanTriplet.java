package dlEasy;

/* *
 * Solution for Problem 9
 * Special Pythagorean Triplet
 * link: https://projecteuler.net/problem=9
 * 
 * @author: Rehan
 * */

public class P9_SpecialPythagoreanTriplet {

	public static void main(String[] args) 
	{
		int p=0,b=0,h=0,ps=0,bs=0,hs=0;
		for(int i=1;i<=500;i++)
		{
			for(int j=2;j<=500;j++)
			{
				for(int k=3;k<=500;k++)
				{
					p=i;b=j;h=k;
					
					ps=(int)Math.pow(p, 2);
					bs=(int)Math.pow(b, 2);
					hs=(int)Math.pow(h, 2);
					
					if((ps+bs)==hs)
					{
						System.out.println("Pythagorean Triplet: P = "+p+" | B = "+b+" | H = "+h);
						if((p+b+h)==1000)
						{
							System.out.println("*****************************************************************");
							System.out.println("Special Pythagorean Triplet = "+p+" "+b+" "+h);
							System.out.println("*****************************************************************");
							System.out.println("Product of the Special Pythagorean Triplet = "+(p*b*h));
							System.out.println("*****************************************************************");
							break;
						}
					}	
				}
			}
		}
	}
}
// p.s need help with the code to remove the duplicate values of p,b and h.
