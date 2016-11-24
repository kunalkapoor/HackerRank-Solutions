package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class FillingJars
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in); 
		long n, m, a, b, k;
		long total, avg;
		
		n = Long.parseLong(in.next());
		m = Long.parseLong(in.next());
		
		total = 0;
		for(int i=0; i<m; i++)
		{
			a = Long.parseLong(in.next());
			b = Long.parseLong(in.next());
			k = Long.parseLong(in.next());
			
			total += (b-a+1)*k;
		}
		
		avg = total / n;
		System.out.println(avg);
	}
}
