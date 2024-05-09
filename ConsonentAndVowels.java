package rivision;

public class ConsonentAndVowels 
{
	// count vowels and Consonent
		// i/p= Dharmendra;  vowels count= 03; consonent= 07
		public static void main(String[] args)
		{
		     String s ="Dharmendra";
		     int vowelscount=0;
		     int consonentcount=0;
		     for(int i=0; i<s.length(); i++)
		     {
		    	 char c =s.charAt(i);
		    	 if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u')
		    	 {
		    		 vowelscount++;
		    	 }
		    	 else
		    	 {
		    		 consonentcount++; 
		    	 }
		     }
		     System.out.println("consonentcount: "+consonentcount);
		     System.out.println("vowelscount: "+vowelscount);

		}

	}

