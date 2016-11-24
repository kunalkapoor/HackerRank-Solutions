package algorithms.warmup;

import java.util.Scanner;

public class UtopianTree
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t;
		int cycles, height;
		
		t = in.nextInt();
		for (int i=0; i<t; i++)
		{
			cycles = in.nextInt();
			height = calculateTreeHeight(cycles);
			System.out.println(height);
		}
	}

	private static int calculateTreeHeight(int cycles)
	{
		int height = 1;
		for(int i=1; i<=cycles; i++)
		{
			if(i%2 == 1)
				height *= 2;
			else
				height++;
		}
		return height;
	}
	
}
