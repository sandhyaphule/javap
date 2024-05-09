package OverloadingDicussion;

public class Vowelchar 
{
	public static void main(String[] args) 
	{
		//String s= " Good Morning";
		
		String s= " Good Evening";

		int count =0;
		
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='a'||ch=='u')//vowel chk karyche a e i o a u ji string denaar tyamadhe
				
		
			{
				System.out.println(ch+" is vowel");
			
				
			}
			else
			{
				System.out.println(ch+" is not vowel");
	
			}
			
		}
		
	

}


}
