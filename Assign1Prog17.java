
/*17. Write a program in C++ to find the Area and Perimeter of a Rectangle.   
Sample Output:
Find the Area and Perimeter of a Rectangle :
-------------------------------------------------
Input the length of the rectangle : 10
Input the width of the rectangle : 15
The area of the rectangle is : 150
The perimeter of the rectangle is : 50
*/


import java.util.*;

public class Assign1Prog17{

	public static void main(String []args){

		int l,w;
		double area,peri;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the length of the rectangle : ");
		l=sc.nextInt();
		System.out.println("Input the width of the rectangle : ");
		w=sc.nextInt();
		   area=l*w;
		    peri=2*l+2*w;
		System.out.println("The area of the rectangle is : "+area);
		System.out.println("The perimeter of the rectangle is : "+peri);		
	
	}
}