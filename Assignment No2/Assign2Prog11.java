//11)C++ Program to Find Factorial

import java.util.*;
public class Assign2Prog11 {

	public static int fact(int n) {
		int res=1;
		if(n>0)
		{
			res=res*n*fact(n-1);
		}
			
			return res;
	}
	public static void main(String[] args) {
	
		int x,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to calculate factorial");
		x=sc.nextInt();
		ans=fact(x);
		System.out.println("Factorial of number "+x+" is :"+ans);

	}

}
