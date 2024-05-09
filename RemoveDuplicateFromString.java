package rivision;

import java.util.ArrayList;

public class RemoveDuplicateFromString 
{
	//i/p ="Google" o/p= Gogle  count =5

		public static void main(String[] args) 
		{
			String ip="Googeless";  // o e s
			int count=0;
			String s =" ";

			ArrayList<Character> al =new ArrayList<>();
			for(int i=0; i<ip.length(); i++)
			{
				if(!(al.contains(ip.charAt(i))))
				{
					 al.add(ip.charAt(i));
//					System.out.println(s);
//					 count++;
//	                 continue;   
	                
				}
//				else
//				{
//					 al.add(ip.charAt(i));
//					 //count++;
				
				
				
//				}
			}
			
	          System.out.println(al+" : "+count);
		}

	}

