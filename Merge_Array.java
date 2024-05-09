package Interviewround;

import java.util.Arrays;

public class Merge_Array 
{
	public static void main(String[] args)
	{
		int a [] = {1,2,3,2,1,1};
		int b [] = {5,3,4,2,1,1};
		//op- 1 1 1 1 1 2 2 2 3 3 4 5
		// merge + sort
		
							//12
		int c [] = new int [a.length+b.length];  //1,2,3,2,1,1_5,3,4,2,1,1
		   int d =0;            // 6
		for(int i=0; i<a.length; i++)
		{
			  c[i]=a [i];									// c[d]=a[i];    d++;
			
		}							
		for(int i=a.length; i<c.length; i++)          // we can start from i=0; i<b.length; =++
		{
			  c[i]=b[d];                             //// c[d]=b[i];    d++;
			  d++;
		}
		Arrays.sort(c);//this method use to sort arrays
		for(int cc:c)
		{
			System.out.print(cc+" ");
		}
		

}
}
