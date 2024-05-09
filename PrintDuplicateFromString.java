package rivision;

public class PrintDuplicateFromString 
{
public static void main(String[] args) {
		
		String ip="Googeless";  // o e s
		
       char[] arr = ip.toCharArray();
       
       for(int i=0; i<arr.length; i++)
       {
    	   for(int j=i+1; j<arr.length; j++)
    	   {      //G ==0, G ==0 , G== g ,G==e, G==l,G==e, G==s,G==s
    		      // o==o, o==g, o==g,o== g ,o==e, o==l,o==e, o==s,o==s
    		      //o==g,  
    		      //g==e
    		     //e==l           e==e
    		   
    		   if(arr[i]==arr[j])
    		   {
    			   System.out.print(arr[j]);
    		   }
    	   }
       }
 }

}

