package algorithms.warmup;

import java.util.Scanner;

public class MaximizingXOR
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int l, r;
		
		l = in.nextInt();
		r = in.nextInt();
		
		System.out.println(calculateMaxXOR(l, r));
	}

	private static int calculateMaxXOR(int l, int r)
	{
		int highestBitL, highestBitR;
		
		if(l == r)
			return 0;
		
		highestBitL = Integer.highestOneBit(l);
		highestBitR = Integer.highestOneBit(r);
		
		if(highestBitR > highestBitL)
			return ((highestBitR<<1) - 1);
		
		do
		{
			highestBitL /= 2;
		}
		while(l/highestBitL == r/highestBitL);
		return ((highestBitL<<1) - 1);
	}	
}
