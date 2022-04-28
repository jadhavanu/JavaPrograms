/*20. Write a program in C++ to convert temperature in Celsius to Fahrenheit.   
Sample Output:
Convert temperature in Celsius to Fahrenheit :
---------------------------------------------------
Input the temperature in Celsius : 35
The temperature in Celsius : 35
The temperature in Fahrenheit : 95
*/


import java.util.*;

public class Assign1Prog20{

	public static void main(String []args){
		double f,c;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Convert temperature in Celsius to Fahrenheit :");
		System.out.println("Input the temperature in Celsius : ");
		c=sc.nextDouble();
			f=(c*1.8)+32;
		System.out.println("The temperature in Celsius : "+c);
		System.out.println("The temperature in Fahrenheit : "+f);
		
	}
}