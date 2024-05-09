package Interviewround;

public class Duplicatecharstr 
{
	public static void main(String[] args) 
	{
		String s="Google";
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					
					System.out.println(s.charAt(i));
					
					//print count 
					System.out.println(count);
				}
			}
		}
		
	}

}
