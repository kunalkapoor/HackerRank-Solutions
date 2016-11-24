package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class LonelyInteger
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in); 
		int n;
		int[] count = new int[101];
		
		for(int i=0; i<=100; i++)
			count[i] = 0;
		
		n = Integer.parseInt(in.next());
		for(int i=0; i<n; i++)
			count[in.nextInt()]++;

		for(int i=0; i<=100; i++)
			if(count[i] == 1)
				System.out.println(i);		
	}
}
