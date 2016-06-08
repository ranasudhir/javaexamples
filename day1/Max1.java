import java.util.Scanner;

//namespace javaexamples.com
//{
	public class Max1
	{
		public static void main(String[] args)
		
		{
			int x,y;
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter a value for x:");
			x=scan.nextInt();
			System.out.println("Please enter a value for y:");
			y=scan.nextInt();
			System.out.println("x is: " +x );
			System.out.println("y is: " +y);
			if(x>y)
			{
				System.out.println("x is greater than y");
			}	
			else
			{
				System.out.println("y  is greater than x");
			}			
			
					
		}
		
		
	}	
	
//}