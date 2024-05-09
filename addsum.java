package Interviewround;

public class addsum 
{

	public static void main(String[] args) 
	{
		int[] ar = {100, 11, 45, 9, 34, 23, 7, 56, 85, 47};//56

		
		//9
				for (int i=0; i<ar.length; i++)//-1
				{
					for(int j=i+1; j<ar.length; j++)//-1
					{
						if(ar[i]>ar[j])
						{
							ar[i] = ar[i]+ar[j];//100+11=111 a=a+b a=20+10=30 
							ar[j] = ar[i]-ar[j];//111-11=100 b=a-b b=30-10=20
							ar[i] = ar[i]-ar[j];//111-100=11 a=a-b a=30-20=10
						}
					}
				}
				for(int i:ar)
				{
					System.out.print(i+" ");
				}
				System.out.println();
				System.out.println(ar[ar.length-2]);
			}
	}

