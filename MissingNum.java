package Interviewround;

public class MissingNum {

	public static void main(String[] args) 
	{
		int[] ar = {2,5,11,20,137};//5 times//2+0=2,2+3=5,5+6=11,11+9=20,20+12=32,32+15=47,47+18=65,65+21=86,86+24=110,110+27
		int mul;
		int prev=0;				//5<5
		for(int i=0, j=0; i<ar.length; i++,j++)//5 6 ---
		{
			//2+0=2--2+3=5--5+6=11--11+9=20  {2,5,11,20,65}
			mul=prev+(3*j);//47+18=65
			if(mul==ar[i])//65==65			
			{
				prev=ar[i];//65
				continue;
			}
			else if(mul!=0)
			{
				System.out.print(mul+" ");//47
				prev=mul;//47
				i--;//3
			}
			else
			{
				prev=ar[i];
			}
		}

	}

}
