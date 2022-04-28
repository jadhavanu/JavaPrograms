/*38. Write a program in C++ that takes a number as input and prints its multiplication table upto 10.   
Sample Output:
Print the multiplication table of a number upto 10:
--------------------------------------------------------
Input a number: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
*/

import java.util.*;

public class Assign1Prog38{

	public static void main(String [] args){

	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Print the multiplication table of a number upto 10 :");
	System.out.println("Input a number : ");
	n=sc.nextInt();
	for(i=1;i<=10;i++)
	{
		System.out.println(n+" * "+i+" = "+(n*i));
	}
	}
}