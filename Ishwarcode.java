package rivision;

public class Ishwarcode 
{

	public static void main(String[] args) 
	{

			String s ="have ! a nice day";   // 
			
			  // String s=s1.replaceAll("[!]", "");
					String splitarray[]=s.split(" ");
			
			String charvar="";
			for(int i=0; i<splitarray.length; i++)
			{
				   String var=splitarray[i]+" ";
				
				   
				   for(int j=var.length()-1; j>=0; j--)
				{
					 charvar= charvar+var.charAt(j);
					
					
				}
		     }
			
			 System.out.println(charvar.replaceAll("[!]", ""));;
			
			
			
			
		}

	}

	