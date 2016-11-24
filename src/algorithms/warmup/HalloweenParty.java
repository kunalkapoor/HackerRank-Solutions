package algorithms.warmup;

import java.util.Scanner;

public class HalloweenParty
{
	public static void main(String[] args)	
	{
		Scanner in = new Scanner(System.in); 
		int t;
		long k, ans;
		
		t = in.nextInt();
		for(int i=0; i<t; i++)
		{
			k = in.nextInt();
			ans = k/2L;
			ans *= k-ans;
			System.out.println(ans);
		}
		
		in.close();
	}
}
