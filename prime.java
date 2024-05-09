package Interviewround;

public class prime 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int count = 0;//declare vari
		
		while(i <= 10)//then chk condition 1ha 10 chya pekshya chota ahe ka
		{
			for(int j = 1; j <= i; j++)
			{
				if(i%j == 0)
				{
					count = count + 1;
				}
			}
			if(count == 2)
			{
				System.out.print(i+" ");
			}
			count = 0;
			i++;
		}

	}
}

