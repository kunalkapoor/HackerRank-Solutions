package algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryChildren
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numPackets, numKids;
		int[] packets;
		
		numPackets = Integer.parseInt(in.readLine());
	    numKids = Integer.parseInt(in.readLine());
	    packets = new int[numPackets];
		
	    for(int i=0; i<numPackets; i++)
	    	packets[i] = Integer.parseInt(in.readLine());
	    
	    System.out.println(computeUnfairness(packets, numKids));
	}

	private static int computeUnfairness(int[] packets, int numKids)
	{
		int difference = 200000000, temp;

		Arrays.sort(packets);
		for(int i=0; i<packets.length - numKids; i++)
		{
			temp = packets[numKids+i-1] - packets[i];
			if(difference > temp)
				difference = temp;
		}
		
		return difference;
	}
}
