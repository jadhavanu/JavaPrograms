import java.util.Scanner;

public class Assign2Prog28 {

	public static void main(String[] args) {
		
		int r;
		char c;
		Scanner sc=new Scanner (System.in);
		System.out.println("Pyramid:");
		System.out.println("Enter the number of rows to print:");
		r=sc.nextInt();
		System.out.println("Enter the character to print in pyramid:");
		c=sc.next().charAt(0);
		PrintPyramid myObj=new PrintPyramid();
		myObj.printPyramid(r,c);

	}

}
