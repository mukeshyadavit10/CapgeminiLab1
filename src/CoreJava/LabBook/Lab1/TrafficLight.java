package CoreJava.LabBook.Lab1;
import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Select Light Color");
		int i= scr.nextInt();
		TrafficLight tf =new TrafficLight();
		switch(i)
		{
		case 1:tf.yellow();
		   break;
		case 2:tf.green();
		   break;
		case 3:tf.red();
		break;
		default: System.out.println("Wrong Choice");
		}
		
	}
	
	
	void yellow()
	{ 
		System.out.println("ready");	
	}
	void green()
	{
		System.out.println("go");	
	}
	void red()
	{
		System.out.println("Stop");
	}
}
