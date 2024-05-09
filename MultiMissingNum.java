package Interviewround;

public class MultiMissingNum {

	public static void main(String[] args) 
	{
		int[] ar = {4,8,12,20,24,32,80};
		int diff;
		int tot = 0;
		for(int i=0; i<ar.length-1; i++)
		{
			diff = ar[i+1]/4-ar[i]/4;
			if(diff>1)
			{
				for(int j=1; j<diff; j++)
				{					
					tot = ar[i] + 4*j;
					System.out.print(tot+" ");
					tot = 0;
				}
			}
		}
	}

}
