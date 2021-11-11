package CoreJava.LabBook.Lab1;
import java.util.Scanner;

public class Cubes {

	public static void main(String[] args) 
{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		Cubes.find(num);
		
	}
	
	public static void find(int num) {
		int digit;
		int sum=0;
		
		while(num!=0) {
			digit = num%10;
			sum = sum + (digit*digit*digit);
			num=num/10;
		}
		
		System.out.println("Sum of the cubes of the digits is "+sum);
	}

}

