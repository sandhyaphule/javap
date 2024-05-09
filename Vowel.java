package Interviewround;

public class Vowel
{

	public static void main(String[] args) 
	{
		String s="Good Morning";
		int vcnt=0,ccnt=0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='a'||ch=='u')
			{
				vcnt++;
				
		}
			else
			{
				ccnt++;
			}
		}
			System.out.println("The Vowels are : "+vcnt);
			System.out.println("The Consonants are : "+ccnt);
			System.out.println("The Vowel count is "+vcnt+"The consonant count is "+ccnt+".");
	

}
}
