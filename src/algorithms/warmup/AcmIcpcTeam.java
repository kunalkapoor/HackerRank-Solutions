package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class AcmIcpcTeam
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in); 
		int n, m, i, j, k, topics, teams;
		int[][] matrix;
		String input;
		
		n = Integer.parseInt(in.next());
		m = Integer.parseInt(in.next());
		matrix = new int[n][m];
		
		for(i=0; i<n; i++)
		{
			input = in.next();
			for(j=0; j<m; j++)
				matrix[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
		}

		topics = 0;
		teams = 1;
		for(i=0; i<n-1; i++)
		{
			for(j=i+1; j<n; j++)
			{
				int temp = 0;
				for(k=0; k<m; k++)
					if(matrix[i][k] == 1 || matrix[j][k] == 1)
						temp++;
				if(temp > topics)
				{
					teams = 1;
					topics = temp;
				}
				else if(temp == topics)
					teams++;
			}
		}
		System.out.println(topics);
		System.out.println(teams);
	}
}
