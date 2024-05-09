package Interviewround;

import java.util.Arrays;

public class MayurProgInterview 
{
	

	public static void main(String[] args) 
	{
		String str="32400121200";


		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		for(char ccc:ch)
		{
			System.out.print(ccc);
		}
		System.out.println();

		// 00001122234;  

		// Output should be: 00003241212 (all zeroes should be in starting)

		String zero="";
		String number="";
		String  op;

		for(int i=0; i<str.length(); i++)
		{
			if( str.charAt(i)=='0')
			{
				zero=zero+str.charAt(i);
			}
			else
			{
				number=number+str.charAt(i);
			}
		}
		System.out.println(op=zero+number); // // 00003241212


		char[] chr = number.toCharArray();
		Arrays.sort(chr);
		System.out.print(zero);
		for(char c:chr)
		{
			System.out.print(c);   //00001122234
		}
	}

}
