import java.util.*;

//5)C++ Program to Check Whether Number is Even or Odd
public class Assign2Prog5 {
	public static boolean check(int x)
	{
		boolean flag=false;
		for (int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				flag=true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for even or odd : ");
		x=sc.nextInt();

		if(check(x))
			System.out.println(x+" is odd");
		else
			System.out.println(x+" is even");
	}

}
