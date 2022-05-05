
//32)C++ Program to Check Whether a Number can be Express as Sum of Two Prime Numbers

import java.util.*;

public class Assign2Prog32 {

	public static void main(String [] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	n=sc.nextInt();
	
	SumPrime obj=new SumPrime();
	obj.checkSumOfPrime(n);
	}
}
	
