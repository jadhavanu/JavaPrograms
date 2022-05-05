//21)C++ Program to Multiply two Numbers

import java.util.*;
public class Assign2Prog21 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two numbers to multiply:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		Multiply myObj=new Multiply();
		myObj.multiply(n1, n2);

	}

}
