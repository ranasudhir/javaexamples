import java.util.Scanner;

public class IfElse{
	
	public static void main(String[] args){
		
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value for x: ");
		x=scan.nextInt();
		System.out.println("Please enter a value for y: ");
		y=scan.nextInt();
		if(x>y){
			System.out.println("The number: " + x + ">" + y);
		}
		else
		if(y>x){	
			System.out.println("The number: " +y + ">"  + x);
		}
	}
}