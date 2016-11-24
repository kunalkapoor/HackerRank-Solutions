package algorithms.warmup;

import java.util.Scanner;

public class SherlockAndSquares
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t, a, b;

		t = in.nextInt();
		for (int i=0; i<t; i++)
		{
			a = in.nextInt();
			b = in.nextInt();
			
			System.out.println((int)Math.sqrt(b) - (int)Math.ceil(Math.sqrt(a)) + 1);
		}
	}
}
