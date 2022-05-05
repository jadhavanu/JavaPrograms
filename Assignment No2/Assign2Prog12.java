//12)C++ Program to Generate Multiplication Table

import java.util.*;
public class Assign2Prog12 {
	
	public void multiplicationTable(int x) {
		System.out.println("Multiplication table of "+x);
		for(int i=1;i<=10;i++) {
			System.out.println(x+" * "+i+" = "+(x*i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print multiplication table :");
		
		n=sc.nextInt();
		Assign2Prog12 myObj=new Assign2Prog12();
		myObj.multiplicationTable(n);
		
	}

}
