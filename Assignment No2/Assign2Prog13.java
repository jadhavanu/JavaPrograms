//13)C++ Program to Display Fibonacci Series

import java.util.*;
public class Assign2Prog13 {

	public static void fibonacci(int x,int y)
	{
		int sum;
		System.out.println("Fibonacci series is :");
		System.out.print(x+"  "+y+"  ");
		for(int i=0;i<10;i++)
		{
			sum=x+y;
			x=y;
			y=sum;
			System.out.print(sum+"  ");
		}
	}
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the seeds for fibonacci series : ");
		System.out.print("Seed 1:");
		n1=sc.nextInt();
		System.out.print("Seed 2:");
		n2=sc.nextInt();
		fibonacci(n1,n2);
	}

}
