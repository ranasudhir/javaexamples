//This code will show the if condition
import java.util.Scanner;

public class IfCon{
	
	public static void main(String[] args){
		int x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any value for x from 5 to 10");
		System.out.println("value of x should be less than or greater than 7");
		x=scan.nextInt();
		if(x<7){
			System.out.println("The value entered is: " +x);
		}
		System.out.println("The if statement is easy");
	}
		
}