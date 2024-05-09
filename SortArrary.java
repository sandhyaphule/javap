package Interviewround;

import java.util.Arrays;

public class SortArrary 
{
	public static void main(String[] args) 
	{
		
	String s [] = {"abcd", "efgh", "ijkl", "lmno", "pqrs"};
	
    Arrays.sort(s);
    
    
	//for(String w:s)
    
    for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);

	}
}
}

//Non-Primitive to Primitive using '.parse...' methods
//Integer.parseInt(st)
//Double.parseDouble(st)
//Float.parseFloat(st)
//Short.parseShort(st)
//Byte.parseByte(st)
//Long.parseLong(st)

//Primitive to Non-Primitive using '.valueof()' methods
//System.out.println(String.valueOf(8));
//System.out.println(String.valueOf(8.8f));
//System.out.println(String.valueOf(8.88888));
//System.out.println(String.valueOf('c'));	

//Non-Primitive to Primitive using '.valueof()' methods
//String sdf = "100";
//System.out.println(Integer.valueOf(sdf));
//System.out.println(Float.valueOf(sdf));
//System.out.println(Double.valueOf(sdf));
//System.out.println(Short.valueOf(sdf));
//System.out.println(Byte.valueOf(sdf));
//System.out.println(Long.valueOf(sdf));
//System.out.println(Character.valueOf('v'));
