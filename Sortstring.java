package Interviewround;

public class Sortstring 
{
	public static void main(String[] args) 
	{
		String []a= {"madhura","manoj","sagar","sandhya","mayur","amol"};
		String str;
		for(int i=0;i<a.length;i++)//inner loop
		{
			for(int j=0;j<a.length-1;j++)//outerloop
				
			{
				if(a[j].compareTo(a[j+1])>0)//compaire string
						{
					str=a[j];
					a[j]=a[j+1];
					a[j+1]=str;
						}
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
	

		System.out.print(a[i]+" ");
	}
}
}

		
//	


//String s="madhura,manoj,tangi,sandhya,";
//String str=" ";
