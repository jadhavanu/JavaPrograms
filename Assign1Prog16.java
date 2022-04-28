/*16. Write a program in C++ to calculate the volume of a cylinder.   
Sample Output:
Calculate the volume of a cylinder :
-----------------------------------------
Input the radius of the cylinder : 6
Input the height of the cylinder : 8
The volume of a cylinder is : 904.32
*/

import java.util.*;

public class Assign1Prog16{

	public static void main(String []args){

		int r,h;
		double vol;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the radius of the cylinder : ");
		r=sc.nextInt();
		System.out.println("Input the height of the cylinder : ");
		h=sc.nextInt();
		vol=3.14*r*r*h;
		System.out.println("The volume of a cylinder is : "+vol);		
	
	}
}