package CoreJava.LabBook.Lab1;
import java.util.Scanner;

public class Power{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		if(Power.checkNumber(num)) {
			System.out.println("Number is in powers of two");
		}
		else {
			System.out.println("Number is not in powers of two");
		}
		
	
	}
	
	public static boolean checkNumber(int num) {
		boolean value = false;
		for(int i=1;i<=100;i++) {
			if(Math.pow(2, i)==num) {
				value=true;
				break;
			}
		}
		
		return value;
	}

}


