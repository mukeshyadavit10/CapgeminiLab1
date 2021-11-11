package CoreJava.LabBook.Lab1;
import java.util.Scanner;

public class Calculate{
	
     	    static int calculateSum(int N, int X, int Y)
	    {
	        int S1, S2, S3;
	     
	        S1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2;
	        S2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2;
	        S3 = ((N / (X * Y))) * (2 * (X * Y)
	                          + (N / (X * Y) - 1) * (X * Y))/ 2;
	     
	        return S1 + S2 - S3;
	    }
	     
	    public static void main(String []args)
	    {
	    	Scanner s = new Scanner(System.in);
	    	
	    	System.out.println("Enter the nth natural number to find the sum:");
	    	
	    	int N = s.nextInt();
	    	
	        int X = 3, Y = 5;
	     
	        System.out.println(calculateSum(N, X, Y));
	     
	    }

}

