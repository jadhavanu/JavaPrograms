/*29. Write a program in C++ to compute quotient and remainder.   
Sample Output:
Compute quotient and remainder :
-------------------------------------
Input the dividend : 25
Input the divisor : 3
The quotient of the division is : 8
The remainder of the division is : 1
*/


import java.util.*;

public class Assign1Prog29{

	public static void main(String []args){
		int x,y;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Compute quotient and remainder : ");
		System.out.println("Input the dividend : ");
		x=sc.nextInt();
		System.out.println("Input the divisor : ");
		y=sc.nextInt();
		System.out.println("The quotient of the division is : "+x/y);
		
		System.out.println("The remainder of the division is :"+x%y);
	
	}
}
