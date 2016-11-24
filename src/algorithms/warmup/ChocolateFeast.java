package algorithms.warmup;

import java.util.Scanner;

public class ChocolateFeast
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int t, n, c, m;
		int boughtChocs, freeChocs, totalChocs, wrappers;
		
		t = in.nextInt();
		for (int i=0; i<t; i++)
		{
			n = in.nextInt();
			c = in.nextInt();
			m = in.nextInt();
			
			boughtChocs = n/c;
			wrappers = boughtChocs;
			freeChocs = 0;
			do
			{
				freeChocs += wrappers/m;
				wrappers = wrappers/m + wrappers%m;
			}
			while(wrappers/m > 0);
			totalChocs = boughtChocs + freeChocs;
			
			System.out.println(totalChocs);
		}
	}	
}
