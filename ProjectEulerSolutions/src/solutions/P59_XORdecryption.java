package solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class P59_XORdecryption {

	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		
		Map<Integer, String> m1=new HashMap<Integer, String>();
		Map<Integer, String> m2=new HashMap<Integer, String>();
		
		m1.put(97,"a");
		m1.put(98,"b");
		m1.put(99,"c");
		m1.put(100,"d");
		m1.put(101,"e");
		m1.put(102,"f");
		m1.put(103,"g");
		m1.put(104,"h");
		m1.put(105,"i");
		m1.put(106,"j");
		m1.put(107,"k");
		m1.put(108,"l");
		m1.put(109,"m");
		m1.put(110,"n");
		m1.put(111,"o");
		m1.put(112,"p");
		m1.put(113,"q");
		m1.put(114,"r");
		m1.put(115,"s");
		m1.put(116,"t");
		m1.put(117,"u");
		m1.put(118,"v");
		m1.put(119,"w");
		m1.put(120,"x");
		m1.put(121,"y");
		m1.put(122,"z");
	
		m2.put(65,"A");
		m2.put(66,"B");
		m2.put(67,"C");
		m2.put(68,"D");
		m2.put(69,"E");
		m2.put(70,"F");
		m2.put(71,"G");
		m2.put(72,"H");
		m2.put(73,"I");
		m2.put(74,"J");
		m2.put(75,"K");
		m2.put(76,"L");
		m2.put(77,"M");
		m2.put(78,"N");
		m2.put(79,"O");
		m2.put(80,"P");
		m2.put(81,"Q");
		m2.put(82,"R");
		m2.put(83,"S");
		m2.put(84,"T");
		m2.put(85,"U");
		m2.put(86,"V");
		m2.put(87,"W");
		m2.put(88,"X");
		m2.put(89,"Y");
		m2.put(90,"Z");


		String filepath="C:\\Users\\rsiddiqui\\Desktop\\cipher.txt";
		String line=null;
		String fileText="";
		FileReader fr = null;
		try 
		{
			fr = new FileReader(filepath);
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
		String temp=fileText.replace("\"", "");
		String []str=temp.split(Pattern.quote(","));
		System.out.println("Total numbers present in the txt file = "+str.length);
		
		
		FileWriter fw=null;
		String outputFilePath="C:\\Users\\rsiddiqui\\Desktop\\DeXOR.txt";
		try
		{
			fw=new FileWriter(outputFilePath);
			BufferedWriter bw=new BufferedWriter(fw);
			for (String string : str) 
			{
				for(int i=97;i<=122;i++)
				{
					int key=Integer.valueOf(string);
					int inter=key^i;
					String val=String.valueOf(inter);
					bw.write("Iterating for i = "+i);
					if(m1.containsKey(val))
					{
						bw.write(m1.get(val));
						System.out.println(m1.get(inter));
					}
					else if(m2.containsKey(val))
					{
						bw.write(m2.get(val));
						System.out.println(m2.get(inter));
					}
					else
					{
						//bw.write(String.valueOf(inter));
						System.out.println(inter+" key not present in both hashmaps");
						bw.write("-=:(=-");
					}
				}
			}
			bw.close();
			fw.close();
		}
		catch(FileAlreadyExistsException fe)
		{
			fe.printStackTrace();
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		long end=System.currentTimeMillis();
		long elapsedTime = end - start;
		System.out.println("\nTime taken for the execution : "+elapsedTime+" ms");
	}

}
