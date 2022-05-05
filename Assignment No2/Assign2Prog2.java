//2)C++ Program to Find Quotient and Remainder
import java.util.*;
public class Assign2Prog2 {

	public static void divide(int x,int y)
	{
		System.out.println("After dividing "+x+" by "+y+" quotient is = "+(x/y));
		System.out.println("After dividing "+x+" by "+y+" remainder is = "+(x%y));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//divide(125,20);
		int x,y;
		
		System.out.println("Enter the two number to divide :");
		System.out.print("dividend : ");
		x=sc.nextInt();
		System.out.println();
		System.out.print("divisor : ");
		y=sc.nextInt();
		
		divide(x,y);
	}

}
