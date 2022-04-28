/*30. Write a program in C++ to compute the total and average of four numbers.   
Sample Output:
Compute the total and average of four numbers :
----------------------------------------------------
Input 1st two numbers (separated by space) : 25 20
Input last two numbers (separated by space) : 15 25
The total of four numbers is : 85
The average of four numbers is : 21.25
*/


import java.util.*;

public class Assign1Prog30
{

	public static void main(String []args){
		int n1,n2,n3,n4,total;
		double avg;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Compute the total and average of four numbers : ");
		System.out.println("Input 1st two numbers (separated by space) : ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("Input last two numbers (separated by space) : ");
		n3=sc.nextInt();
		n4=sc.nextInt();
		total=n1+n2+n3+n4;
		avg=total/4;
		System.out.println("The total of four numbers is : "+total);
		
		System.out.println("The average of four numbers is : "+avg);
	
	}
}
