import java.util.Scanner;

//27)C++ Program to Display Factors of a Number

public class Assign2Prog27 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number to calculate factors:");
		n=sc.nextInt();
		System.out.print("Factors of "+n+" are :");
		CalculateFactors.factors(n);
	}

}
