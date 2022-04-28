/*23. Write a program in C++ that converts kilometers per hour to miles per hour.   
Sample Output:
Convert kilometers per hour to miles per hour :
----------------------------------------------------
Input the distance in kilometer : 25
The 25 Km./hr. means 15.5343 Miles/hr.
*/


import java.util.*;

public class Assign1Prog23{

	public static void main(String []args){
		double km,mi;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Convert kilometers per hour to miles per hour : ");
		System.out.println("Input the distance in kilometer : ");
		km=sc.nextDouble();
		mi=km * 0.62137;
		System.out.println("The "+km+"Km./hr. means "+mi+" Miles/hr.");
		
	}
}