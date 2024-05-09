package Interviewround;

public class intPratiksha 
{
	public static void main(String[] args)
	{
		String s ="Pratiksha";
		char s1=' ';
		char s2=' ';
		int count1=0;
		int count=0;
	
		for(int i =0; i<s.length(); i++)
		{
			String c=""+s.charAt(i);
			if(c.equalsIgnoreCase("P"))
			{
				s1=s.charAt(i);
				count++;
			}
			if(c.equalsIgnoreCase("a"))
			{
				s2=s.charAt(i);
				count1++;
			}
		}
		System.out.println("count of "+s1+":"+count);
		System.out.println("count of "+s2+":"+count1);
		
	}

}
