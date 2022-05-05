//4)C++ Program to Swap Two Numbers

import java.util.*;
public class Assign2Prog4 {

	
	public static void swap1(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;		
		System.out.println("After swapping x= "+x+" and y= "+y);
	}
	
	public static void swap2(int x,int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping x= "+x+" and y= "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Swap using third variable : ");
		System.out.println("Enter two numbers to swap : ");
		System.out.print("x = ");
		x=sc.nextInt();
		System.out.print("y = ");
		y=sc.nextInt();
		swap1(x,y);
		System.out.println("Swap Without using third variable : ");
		System.out.println("Enter two numbers to swap : ");
		System.out.print("x = ");
		x=sc.nextInt();
		System.out.print("y = ");
		y=sc.nextInt();
		swap2(x,y);		
		
	}

}
