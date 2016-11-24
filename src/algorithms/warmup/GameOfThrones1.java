package algorithms.warmup;

import java.util.Scanner;

public class GameOfThrones1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str;
		
		str = in.next();
		System.out.println(isAnagramPalindrome(str));
	}

	private static String isAnagramPalindrome(String str)
	{
		int oddCount = 0;
		char[] chars = str.toCharArray();
		for(char c='a'; c<='z'; c++)
		{
			int count = 0;
			for(int i=0; i<chars.length; i++)
				if(c == chars[i])
					count++;
			if(count%2 == 1)
				oddCount++;
		}
		if((chars.length%2 == 1 && oddCount == 1) || (chars.length%2 == 0 && oddCount == 0))
			return "YES";
		return "NO";
	}
}
