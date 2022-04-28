/*
18. Write a program in C++ to find the area of any triangle using Heron's Formula.   
Sample Output:
Find the area of any triangle using Heron's Formula :
----------------------------------------------------------
Input the length of 1st side of the triangle : 5
Input the length of 2nd side of the triangle : 5
Input the length of 3rd side of the triangle : 5
The area of the triangle is : 10.8253
*/

import java.util.*;

public class Assign1Prog18{

	public static void main(String []args){
		float s1,s2,s3;
    		double area,s,s4;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Find the area of any triangle using Heron's Formula :");
		System.out.println("Input the length of 1st side of the triangle  : ");
		s1=sc.nextFloat();
		System.out.println("Input the length of 2nd side of the triangle  ");
		s2=sc.nextFloat();
		System.out.println("Input the length of 3rd side of the triangle :");
		s3=sc.nextFloat();
		    s=(s1+s2+s3)/2;
		    s4=s*(s-s1)*(s-s2)*(s-s3);
		    area=Math.sqrt(s4);
  		System.out.println("The area of the triangle is : "+area);
		
	}
}