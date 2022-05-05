//23)C++ Program to Check Whether a Number is Prime or Not

import java.util.Scanner;

public class Assign2Prog23 {

	public static void main(String[] args) {

		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number to check for prime:");
		n=sc.nextInt();
		//CheckPrime myObj=new CheckPrime();
		CheckPrime.checkPrime(n);

	}

}
