import java.util.Scanner;

public class Assign2Prog26 {

	public static void main(String[] args) {

		int n1,n2;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the range of numbers to check for armstrong:");
		System.out.println("Starting number:");
		n1=sc.nextInt();
		System.out.println("Ending number:");
		n2=sc.nextInt();
		CheckArmstrongRange myObj=new CheckArmstrongRange();
		myObj.checkArmstrong(n1,n2);

	}

}
