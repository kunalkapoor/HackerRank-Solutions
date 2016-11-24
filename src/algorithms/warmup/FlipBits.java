package algorithms.warmup;

import java.util.Scanner;

public class FlipBits
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t;
		long a, flip;
		
		t = in.nextInt();
		for (int i=0; i<t; i++)
		{
			a = in.nextLong();
			flip = flipInt32(a);
			System.out.println(flip);
		}
	}

	private static long flipInt32(long a)
	{
		long b = 4294967295L;
		return a^b;
	}
}
