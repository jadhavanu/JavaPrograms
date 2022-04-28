
/*
33. Write a program in C++ to divide two numbers and print on the screen.   
Sample Output:
Divide two numbers and print:
----------------------------------
The quotient of 30 and 10 is : 3
*/

import java.util.*;

public class Assign1Prog33{

	public static void main(String []args){
	int n1,n2,q,r;
	System.out.println("Divide two numbers and print: ");
	System.out.println("Input the dividend : ");
	Scanner sc=new Scanner(System.in);
	n1=sc.nextInt();
	System.out.println("Input the divisor: ");
	n2=sc.nextInt();
	System.out.println("The quotient of "+n1+" and "+n2+" is :"+n1/n2);
	System.out.println("The quotient of "+n1+" and "+n2+" is :"+n1%n2);
	}
}