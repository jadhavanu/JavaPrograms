//10)C++ Program to Check Leap Year

import java.util.*;
public class Assign2Prog10 
	{
		public static boolean leapcheck(int year)
		{
		boolean flag;
		if(year%4==0)
			flag=true;
		else
			flag=false;
		
		return flag;		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int year;
		boolean x;
		System.out.println("Enter the year to check for leap year : ");
		year=sc.nextInt();
		x=leapcheck(year);
		if(x==true)
			System.out.println("Year "+year+" is leap year");
		else
			System.out.println("Year "+year+" is not a leap year");
	}

}
