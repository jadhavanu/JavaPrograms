
/*
28. Write a program in C++ to find the area of Scalene Triangle.   
Sample Output:
Find the area of Scalene Triangle :
----------------------------------------
Input the length of a side of the triangle : 5
Input the length of another side of the triangle : 6
Input the angle between these sides of the triangle : 6
The area of the Scalene Triangle is : 1.56793
*/



import java.util.*;

public class Assign1Prog28{

	public static void main(String []args){
		double s1, s2, ang,area, pi=3.14;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Find the area of Scalene Triangle :: ");
		System.out.println("Input the length of a side of the triangle : ");
		s1=sc.nextDouble();
		System.out.println("Input the length of another side of the triangle : ");
		s2=sc.nextDouble();
		System.out.println("Input the angle between these sides of the triangle : ");
		ang=sc.nextDouble();
    		area=((s1*s2)*Math.sin((pi/180)*ang))/2;

		System.out.println("The area of the Scalene Triangle is :"+area);
	
	}
}
