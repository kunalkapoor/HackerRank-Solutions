package algorithms.warmup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class SherlockAndGCD
{
	public static void main(String[] args)	
	{
		Scanner in = new Scanner(System.in); 
		int t, n, flag;
		int[] a;
		LinkedHashMap<Integer, ArrayList<Integer>> factors;
		
		t = in.nextInt();
		for(int i=0; i<t; i++)
		{
			n = in.nextInt();
			a = new int[n];
			flag = 0;
			factors = new LinkedHashMap<>();
			for(int j=0; j<n; j++)
			{
				a[j] = in.nextInt();
				factors.put(a[j], getFactors(a[j]));
			}
			
			Iterator<Entry<Integer, ArrayList<Integer>>> it = factors.entrySet().iterator();
			while(it.hasNext())
			{
				ArrayList<Integer> list1 = it.next().getValue();
				Iterator<Entry<Integer, ArrayList<Integer>>> it2 = factors.entrySet().iterator();
				it2.next();
				while(it2.hasNext())
				{
					ArrayList<Integer> list2 = it2.next().getValue();
					list2.retainAll(list1);
					if(list2.isEmpty())
					{
						flag = 1;
						break;
					}
				}
			}
			
			if(flag == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		in.close();
	}

	private static ArrayList<Integer> getFactors(int a)
	{
		int num = a;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i=2; i<=num; i++)
		{
			if(num % i == 0)
			{
				num /= i;
				factors.add(i);
			}
		}
		
		return factors;
	}
}
