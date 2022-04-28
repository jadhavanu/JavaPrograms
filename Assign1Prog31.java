/*31. Write a program in C++ to input a single digit number and print a rectangular form of 4 columns and 6 rows.   
Sample Output:
Make a rectangular shape by a single digit number :
--------------------------------------------------------
Input the number : 5
5555
5 5
5 5
5 5
5 5
5555
*/

import java.util.*;

public class Assign1Prog31{

	public static void main(String [] args){
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Make a rectangular shape by a single digit number :");
	System.out.println("Input the number : ");
	n=sc.nextInt();
	System.out.println("");
	
	System.out.print(n);
	System.out.print(n);
	System.out.print(n);
	System.out.print(n);
	System.out.println("");
	System.out.println(n+"  "+n);
	System.out.println(n+"  "+n);
	System.out.println(n+"  " +n);
	System.out.println(n+"  "+n);
	System.out.print(n);
	System.out.print(n);
	System.out.print(n);
	System.out.print(n);
	System.out.println("");
	
	
	

	}

}