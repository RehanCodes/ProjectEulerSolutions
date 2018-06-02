package solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* *
 * Solution for Problem 22
 * Names Scores
 * link: https://projecteuler.net/problem=22
 * 
 * @author: Rehan
 * */

public class P22_NamesScores {

	public static void main(String[] args)
	{
		int score=0;
		
		String filePath=".\\InputTextFiles\\P22_Names.txt";
		String line=null;
		String fileText="";
		int finalSum=0;
		Map<String, Integer> alfamap=new HashMap<String, Integer>();
		alfamap.put("A", 1);
		alfamap.put("B", 2);
		alfamap.put("C", 3);
		alfamap.put("D", 4);
		alfamap.put("E", 5);
		alfamap.put("F", 6);
		alfamap.put("G", 7);
		alfamap.put("H", 8);
		alfamap.put("I", 9);
		alfamap.put("J", 10);
		alfamap.put("K", 11);
		alfamap.put("L", 12);
		alfamap.put("M", 13);
		alfamap.put("N", 14);
		alfamap.put("O", 15);
		alfamap.put("P", 16);
		alfamap.put("Q", 17);
		alfamap.put("R", 18);
		alfamap.put("S", 19);
		alfamap.put("T", 20);
		alfamap.put("U", 21);
		alfamap.put("V", 22);
		alfamap.put("W", 23);
		alfamap.put("X", 24);
		alfamap.put("Y", 25);
		alfamap.put("Z", 26);
		
		long start=System.currentTimeMillis();
		
		//Using File Reader
		FileReader fr = null;
		try 
		{
			fr = new FileReader(filePath);
			BufferedReader br=new BufferedReader(fr);
			try 
			{
				while((line=br.readLine())!=null)
				{
					fileText=fileText+line;
				}
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		//System.out.println(fileText);
		
		String temp=fileText.replace("\"", "");
		String []str=temp.split(Pattern.quote(","));
		Arrays.sort(str);
		
		for (String string : str) 
		{
			int sum=0;
			int relVal=0;
			int index=0;
			char jit[]=string.toCharArray();
			index=Arrays.asList(str).indexOf(string)+1;
			for (char c : jit) 
			{
				relVal=alfamap.get(String.valueOf(c));
				sum=sum+relVal;	
			}
			score=sum*index;
			System.out.println("Details for => "+string+": Alphabetical Value = "+sum+" and Index Value = "+index+" and Score = "+score);
			
			finalSum=finalSum+score;
			sum=0;
			relVal=0;
			index=0;
		}
		System.out.println("\nTotal of all the name scores in the file = "+finalSum);
		
		long end=System.currentTimeMillis();
		long elapsedTime = end - start;
		System.out.println("\nTime taken for the execution : "+elapsedTime+" ms");

	}
}