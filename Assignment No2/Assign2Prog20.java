//20)C++ Program to Find ASCII Value of a Character
import java.util.*;

public class Assign2Prog20 {

	public static void returnAscii(char c)
	{	
		int n=c;
		System.out.println("Ascii value of character "+c+" is :"+n);
	}
	public static void main(String[] args) {
		char c;
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the character :");
		c=sc.next().charAt(0);
		returnAscii(c);
		
	}
}
