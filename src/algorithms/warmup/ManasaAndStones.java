package algorithms.warmup;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ManasaAndStones
{
	public static void main(String[] args)	
	{
		Scanner in = new Scanner(System.in); 
		int t, n, a, b, total, temp;
		LinkedHashSet<Integer> series;
		
		t = in.nextInt();
		for(int i=0; i<t; i++)
		{
			n = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			
			series = new LinkedHashSet<Integer>();
			
			if(a > b)
			{
				temp = a;
				a = b;
				b = temp;
			}
			
			total = (n-1)*a;
			series.add(total);
			for(int j=1; j<n; j++)
			{
				total = total - a + b;
				series.add(total);
			}
			
			Iterator<Integer> it = series.iterator();
			while(it.hasNext())
				System.out.print(it.next() + " ");
			System.out.println();
		}

		in.close();
	}
}
