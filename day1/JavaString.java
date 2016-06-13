//Java String data type
import java.util.Scanner;

public class JavaString{
	
	public static void main(String[] args){
		
		String x="Hello World";
		// The various different variables initialized to the same constant string will point to the same String instance in memory.
		String x1="Hello World";
		//If you want to be sure that two String variables point to separate String objects, use the new operator like this:
		String x2 = new String("Hello World");
		System.out.println(x2);
		String x3 = new String("Hello World");
		System.out.println(x3);
		String y = new String("This STRING is created with the new keyword");
		String z = new String("\tThis text is one tab in.\r\n..... The newline character");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//String Builder example. How concat takes place with StringBuilder
		
		String one="Sudhir";
		String two="  Rana";
		String three = new StringBuilder(one).append(two).toString();
		System.out.println(three);
		
		//String Length   -----  You can obtain the length of a String using the length() method. The length of a String is the number of characters the String contains - not the number of bytes used to represent the String. 
		
		String ab = "Sudhirr";
		int length = ab.length();
		System.out.println(length);
		
		//Substrings  -----  ou can extract a part of a String. This is called a substring. You do so using the substring() method of the String class.
		
		String abc = "Automation";
		String substring = abc.substring(3,8);
		System.out.println(substring);
		System.out.println("\n");
		//Compare strings
		
		//equals()
		
		String l = "Sudhir";
		String m = "Rana";
		String n = "Sudhir";
		String o = "SUDHIR";
		
		System.out.println(l.equals(m));
		System.out.println(l.equals(n));
		System.out.println(l.equals(o));
		
		//equalsIgnoreCase()
		System.out.println(l.equalsIgnoreCase(o));
		System.out.println("\n");
		
		//startsWith() and ends With()
		
		String d = "This is a good day to code";
		
		System.out.println( d.startsWith("This")    );
		System.out.println( d.startsWith("This", 5) );
		System.out.println( d.endsWith  ("code")    );
		System.out.println( d.endsWith  ("shower")  );
		
		//compare To()
		
		
	}
}