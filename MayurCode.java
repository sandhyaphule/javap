package rivision;

import java.util.ArrayList;

public class MayurCode 
{
	public static void main(String[] args) {

		String s = "Googeless";  // Gogles
		
		ArrayList <Character> al=new ArrayList<>();
		for(int i=0; i<s.length(); i++)
		{
			if(al.contains(s.charAt(i)))
			{			
				System.out.print(s.charAt(i)+" ");
			}
			else
			{
				al.add(s.charAt(i));
			}
			
		}
		System.out.println(al);
	}


}


