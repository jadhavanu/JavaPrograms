//25)C++ Program to Check Armstrong Number

import java.util.Scanner;

public class Assign2Prog25 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number to check for Armstrong:");
		n=sc.nextInt();
		CheckArmstrong.checkArmstrong(n);

	}

}
