/*13. Write a program in C++ to swap two numbers.   
Sample Output:
Swap two numbers :
-----------------------
Input 1st number : 25
Input 2nd number : 39
After swapping the 1st number is : 39
After swapping the 2nd number is : 25
*/

import java.util.*;
public class Assign1Prog13{

	public static void main(String [] args){
		int n1,n2,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 1st number : ");
		n1=sc.nextInt();
		System.out.println("Input 2nd number : ");
		n2=sc.nextInt();
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swapping 1st number is : "+n1);
		System.out.println("After swapping 2nd number is : "+n2);		
	}

}