package Interviewround;

public class Fibonacii1to20 
{
	public static void main(String[] args) 
	{
	int a=0;
	int b=1;
	int c;
	{
	for (int i=1;i<=20;i++)
	{
	c=a+b;
	System.out.println(c+"   ");
	a=b;
    b=c;
	
	}
	}
	}
}


