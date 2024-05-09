package rivision;

public class WTJ 
{
	public static void main(String[] args) 
	{

		String INPUT= "WELCOME TO JAVA";

		String[] arr = INPUT.split(" ");  

		for(int j=arr.length-1; j>=0; j--)
		{

			System.out.print(arr[j]+" ");   
		}
		System.out.println();
   }
}


