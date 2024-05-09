package OverloadingDicussion;

public class CountPattern 
{
	public static void main(String[] args) 
	{
		
	
		String s ="abcdfjabcdfgabcdjabcdjabdjabcd";

		int start =0;
		int end=4;
		
		int count=0;
		String ss[]=new String [s.length()-3];

		for(start=0; end<=s.length(); start++)
		{
			 ss[start] = s.substring(start, end);
			 if(ss[start].equals("abcd"))
			 {
				 count++;
			 }
			end++;
		}
		System.out.println(count);
	}
}
