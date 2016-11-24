package algorithms.warmup;

import java.util.Scanner;

public class TheLoveLetterMystery
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t;
		String str;
		
		t = in.nextInt();
		for (int i=0; i<t; i++)
		{
			str = in.next();
			System.out.println(reductionsRequired(str));
		}
	}

	private static int reductionsRequired(String str)
	{
		char[] chars = str.toCharArray();
		int count = 0;
		
		for(int i=0; i<chars.length/2; i++)
		{
			System.out.println("i = " + i + " difference = " + Math.abs(chars[i] - chars[chars.length-i-1]));
			count += Math.abs(chars[i] - chars[chars.length-i-1]);
		}
		return count;
	}
	
}
