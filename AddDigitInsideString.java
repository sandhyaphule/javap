package OverloadingDicussion;

public class AddDigitInsideString {

		public static void main(String[] args) 
		{
			String s="R3aja12aRA13m";   // 10
			String var="";
			int sum=0;
			boolean flag=false;
			for(int i=0; i<s.length(); i++)
			{
				
				if(Character.isDigit(s.charAt(i)))
				{
					var=var+s.charAt(i); //12
					flag=true;
					if(i!=s.length()-1)
					{
					 continue;  	
					}
				}
				if(flag)
				{
					int add = Integer.parseInt(var);
					sum=sum+add;
					var="";
				}
				flag=false;
				
			}
		 	
		
			System.out.println(sum);
			
			

		}

	}