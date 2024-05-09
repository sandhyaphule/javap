package OverloadingDicussion;

public class OverloadingConcept 
{
	public static void main(String[] args) 
	{
		OverloadingConcept oc = new OverloadingConcept();
		oc.m1();
		m1(1);
//		oc.m1(10, 20);
		int ret = oc.m1(10, 20);
		System.out.println(ret);
	}
	
	public void m1()
	{
		System.out.println("Zero Argument method.");
	}
	
	private static void m1(int i)
	{
		System.out.println("One Argument method.");
	}
	
	public int m1(int i, int j)
	{
		System.out.println("Two Arguments method.");
		int k = i + j;//30
		return k;
	}	
}

