package Interviewround;

public class Occurancesofcount 
{
	public static void main(String[] args) 
	{
		int count=0;
		
		//String S ="sandhya,sandhya,sandhya,sandhya";
		String S ="sandhya,sandhya,sandhya,sandhya,sandhya,sandhya";

		

	      for(int i=S.length()-1;i>=0;i--)//>symbol is grather than 

		{
			if(S.charAt(i)=='d')
			{
				 count++;
			}
		}
			System.out.println(count);
			
		}

}

