
/*22. Write a program in C++ to find the third angle of a triangle.   
Sample Output:
Find the third angle of a triangle :
-----------------------------------------
Input the 1st angle of the triangle : 30
Input the 2nd angle of the triangle : 60
The 3rd of the triangle is : 90
*/

import java.util.*;

public class Assign1Prog22{

	public static void main(String []args){
		int a1,a2,a3;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Find the third angle of a triangle : ");
		System.out.println("Input the 1st angle of the triangle : ");
		a1=sc.nextInt();
		System.out.println("Input the 1st angle of the triangle : ");
		a2=sc.nextInt();
			a3=180-a1-a2;

		System.out.println("The 3rd of the triangle is : "+a3);
		
	}
}