//9)C++ Program to Calculate Sum of Natural Numbers

import java.util.*;

public class Assign2Prog8 {
	
	public static int sum1(int x)
	{
		int s=0;
		for(int i=1;i<=x;i++)
		{
			s=s+i;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,result;
		System.out.println("Enter the number up to which you want to add : ");
		x=sc.nextInt();
		result=sum1(x);
		System.out.println("The sum of natural numbers from 1 to "+x+" is = "+result);
		
	}

}
