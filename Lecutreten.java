package sampleprograme;

public class Lecutreten {

	public static void main(String[] args) {
		Lecutreten t = new Lecutreten();
		Lecutreten.MyFirstClass();
		t.MyFirstClass2();
		
	
	}
		//static method// 
		public static void MyFirstClass()
		{
		System.out.println("static method is running");
		
		}

//non static method 
	public void MyFirstClass2()
	{
		System.out.println("non static method is running");
	}
	}