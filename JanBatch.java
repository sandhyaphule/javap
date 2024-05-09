package sampleprograme;

public class JanBatch {
	//static method 
	public static void one (){
		System.out.println("one is runnig");
	}
		public static void two () {
		System.out.println("one is runnig");
	}
// non static method 
		
		public void three (){
			System.out.println("three is runnig");
		}	
			public void foure (){
			System.out.println("foure is runnig");
			}
		

public static void main(String[] args) {
	System.out.println("Jan batch is runnig");
	one();
	two();
	JanBatch t = new JanBatch();//object create non static method cha 
	t . three();
	t . foure();
	
	
}
	
}
//example 
//wrt program in java for static and non static 