package CoreJava.LabBook.Lab3;

import java.util.Scanner;

public class StringTokenizerDao {

	public StringTokenizerDao(String str, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
        int temp,sum=0;
        String str=sc.nextLine();
        sc.close();
        StringTokenizerDao ref=new StringTokenizerDao(str," ");
        while(ref.hasMoreTokens())
        {
        	temp=Integer.parseInt(ref.nextToken());
        	sum+= temp;        	
        }
        System.out.println("sum: "+sum);
	}

	private String nextToken() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean hasMoreTokens() {
		// TODO Auto-generated method stub
		return false;
	}

	
	



}
