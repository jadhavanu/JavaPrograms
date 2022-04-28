/*2. Write a program in Java to print the sum of two numbersusing Variables.   
Sample Output:
Print the sum of two numbers :
-----------------------------------
The sum of 29 and 30 is : 59
*/

import java.util.*;  


public class Assign1Prog4{

	public static void main(String []args){

		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number to Add : ");
		n1=sc.nextInt();
		System.out.println("Enter the 2nd number to Add : ");
		n2=sc.nextInt();
		System.out.println("The Sum of "+n1+" and "+n2+" is : "+(n1+n2));
	}
}