//24)C++ Program to Display Prime Numbers Between Two Intervals

import java.util.*;

public class Assign2prog24 {

	public static void main(String[] args) {

		int n1,n2;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the range of numbers to check for prime:");
		System.out.println("Starting number:");
		n1=sc.nextInt();
		System.out.println("Ending number:");
		n2=sc.nextInt();
		CheckPrimeRange myObj=new CheckPrimeRange();
		myObj.checkPrime(n1,n2);

	}

}
