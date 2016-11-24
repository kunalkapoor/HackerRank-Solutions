package algorithms.warmup;

import java.util.Scanner;

public class AlternatingCharacters
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
			System.out.println(deletionsRequired(str));
		}
	}

	private static int deletionsRequired(String str)
	{
		char[] chars = str.toCharArray();
		int count = 0;
		
		for(int i=0; i<chars.length-1; i++)
			if(chars[i] == chars[i+1])
				count++;
		
		return count;
	}
	
}
