import java.util.Scanner;
	public class AddNum{
		
		public static void main(String[] args){
			
			int x, y, Total;
			Scanner scan;
			scan=new Scanner(System.in);
			System.out.println("Please enter a number x:");
			x=scan.nextInt();
			System.out.println("Please enter a number y: ");
			y=scan.nextInt();
			Total=x+y;
			System.out.println("The Total of x and y is: " + Total);
		}
	}
