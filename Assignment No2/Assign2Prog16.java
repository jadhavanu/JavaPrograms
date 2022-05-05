//16)C++ Program to Reverse a Number

import java.util.Scanner;


public class Assign2Prog16 {
	
	public static int reverse(int n) {
		int r,rev=0;
		while(n>0)
	    {
	        r=n%10;
	        n=n/10;
	        rev=(rev*10)+r;
	        //cout<<"\n "<<rev;
	    }
		return rev;
	    
	}

	public static void main(String[] args) {
		int x;
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter the number to find its reverse number :");
		x=cs.nextInt();
		System.out.println("Reverse number is :"+reverse(x));
	}

}
