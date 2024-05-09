package Interviewround;

public class DW 
{
	
    public static void main(String[] args) 
    {
	String s = "Dad mom dad mom dad mom";  
    int count; 
    
    String string = s.toLowerCase();    
    String w[] = string.split(" ");    
      
    System.out.println("Duplicate words in a given string : ");  
    
    for(int i = 0; i < w.length; i++) 
    {    
        count = 1;    
        for(int j = i+1; j < w.length; j++) 
        {    
            if(w[i].equals(w[j])) 
            {    
                count++;  
                w[j] = "0";    
            }    
        }    
            
        if(count > 2 && w[i] != "0")   
        	
            System.out.println("the string"+w[i]+"s" +count+"    ");    
    }    
}    

}

