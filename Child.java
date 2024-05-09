package OverloadingDicussion;
public class Child extends Parent
{
	public void m1(int i)
	{
		System.out.println("M1 Method from Child class.");
	}
	
	public void m2(int i)
	{
		System.out.println("M2 Method from Child class.");
	}
	
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.m1(11);
		c.m2(1);
		Parent p = new Parent();
		p.m1(11);
		p.m2(22);
		System.out.println("====================================================");
		Parent p1 = new Child();
		p1.m1(99);
		p1.m2(77);
//		Child c1 = new Parent();	Not VALID	
	}
}

