/*15. Write a program in C++ to calculate the volume of a cube.   
Sample Output:
Calculate the volume of a cube :
---------------------------------------
Input the side of a cube : 5
The volume of a cube is : 125
*/

import java.util.*;

public class Assign1Prog15{

	public static void main(String []args){

		int side;
		double vol;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the side of a cube : ");
		side=sc.nextInt();
		vol=side*side*side;
		System.out.println("The volume of a cube is : "+vol);		
	
	}
}