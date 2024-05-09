package rivision;

public class WelcomeTojava 
{
	//INPUT=WELCOME TO JAVA
		// o/p = EMOCLEW OT AVAJ
		// o/p= AVAJ OT EMOCLEW
		public static void main(String[] args) 
		{
			String INPUT= "WELCOME TO JAVA";
			
			 String[] arr = INPUT.split(" ");  
			 for(int i=0; i<arr.length; i++)
			 {
				 for(int j=arr[i].length()-1; j>=0; j--)
				 {
					    char revchar = arr[i].charAt(j);
					    System.out.print(revchar);
				 }
				 System.out.print(" ");
				 
			 }
			 System.out.println("---------------");
			
			 for(int i=arr.length-1; i>=0; i--)
			 {
				 for(int j=arr[i].length()-1; j>=0; j--)
				 {
					    char revchar = arr[i].charAt(j);
					    System.out.print(revchar);
				 }
				 System.out.print(" ");
			 }
		}

	}

