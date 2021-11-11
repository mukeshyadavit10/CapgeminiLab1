package CoreJava.LabBook.Lab1;
import java.util.Scanner;

class Calculate2{
	public int calculateDifference(int num) {
		int sum1=0;
		int sum2=0;
		
		for(int i=1;i<=num;i++) {
			sum1 = sum1 + (i*i);
			sum2 = sum2+i;
		}
		
		sum2 = sum2*sum2;
		
		int result = sum1-sum2;
		return result;
		
	}
}

public class SquareNsquares{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		
		Calculate2 c = new Calculate2();
		int res = c.calculateDifference(num);
		System.out.println("Difference is: "+res);
		
	
	}

}


