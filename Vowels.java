package Interviewround;

public class Vowels 
{
	public static void main(String[] args) 
	{
		String s= " Good Morning";
		int count =0;
		//int ccnt=0;
		
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='a'||ch=='u')
			{
				count++;
				
				
			}
			
			System.out.println(count);
			
			//System.out.println("No of vowels are:"+ccnt+" thank you");
		}
		
	
	}
}