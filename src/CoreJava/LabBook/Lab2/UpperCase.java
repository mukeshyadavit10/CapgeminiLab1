package CoreJava.LabBook.Lab2;

import java.util.Arrays;

public class UpperCase {
	public String[] sortStrings(String[] arr)
    {  	Arrays.sort(arr);
        
    return arr;
    }
	
	public static void main(String[] args)
	{   String[] arr= {"ORANGE","BananA","Kiwi","AppLE","GrapES","PINEapple"};
	UpperCase ref=new UpperCase();
	String[] sorted=ref.sortStrings(arr);
	for(int i=0;i<sorted.length;i++)
	{
		System.out.print(sorted[i]+" ");
	    
	}
	System.out.println();
	for(int i=(sorted.length/2)+1;i<sorted.length;i++)
	{
		System.out.print(sorted[i].toUpperCase()+" ");
	}
	}

}


