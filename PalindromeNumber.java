package OverloadingDicussion;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
        int number=121;
	    
	    int rev =0;
	    int rem=0;
	    int count=number;
	    while(number!=0)
	    {
	       rem= number%10;  // 1,  2  ,1 
	       rev =rev*10+rem;  //  1,12,121
	       number=number/10;  // 121/10=12,  12/10=1,   1/10=0
	       
	    }
	    System.out.println(rev);   //121
	    if(rev==count)
	    {
	    	System.out.println("number is palindrome");
	    }
	    else
	    {
	    	System.out.println("number is not palindrome");

	    }
		
	}

}
