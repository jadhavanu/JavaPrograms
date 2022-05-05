//22)C++ Program to Check Whether a Number is Palindrome or Not

import java.util.*;

public class Assign2Prog22 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number to check for palindrome:");
		n=sc.nextInt();
		CheckPalindrome myObj=new CheckPalindrome();
		myObj.checkPalindrome(n);
	}

}
