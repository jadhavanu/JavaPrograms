/*32. Write a program in C++ to check whether a number is positive, negative or zero.   
Sample Output:
Check whether a number is positive, negative or zero :
-----------------------------------------------------------
Input a number : 8
The entered number is positive.
 
*/

import java.util.*;

public class Assign1Prog32{

	public static void main(String []args){
	int n;
	System.out.println("Check whether a number is positive, negative or zero : ");
	System.out.println("Input the number : ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	if(n==0)
		System.out.println(n+" is zero ");
	else if(n>0)
		System.out.println(n+" is a Positive number");
	else
		System.out.println(n+"is a Negative number");

	}
}