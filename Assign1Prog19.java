
/*19. Write a program in C++ to find the area and circumference of a circle.   
Sample Output:
Find the area and circumference of any circle :
----------------------------------------------------
Input the radius(1/2 of diameter) of a circle : 5
The area of the circle is : 78.5397
The circumference of the circle is : 31.4159
*/



import java.util.*;

public class Assign1Prog19{

	public static void main(String []args){
		Float r;
    		double area,circum;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Find the area and circumference of any circle :");
		System.out.println("Input the radius(1/2 of diameter) of a circle  : ");
		r=sc.nextFloat();
		
    			area=3.14159*r*r;
   			 circum=2*3.14159*r;
		System.out.println("The area of the circle is : "+area);
		System.out.println("The circumference of the circle is : "+circum);
		
	}
}