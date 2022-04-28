/*14. Write a program in C++ to calculate the volume of a sphere.   
Sample Output:
Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere : 6
The volume of a sphere is : 904.32
*/

import java.util.*;

public class Assign1Prog14{
	public static void main(String [] args){
		int r;
		double vol;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the radius of a sphere : ");
		r=sc.nextInt();
		vol=(4*3.14*(r*r*r))/3;
		System.out.println("The volume of a sphere is : "+vol);		
	}

}