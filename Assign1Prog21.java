/*21. Write a program in C++ to convert temperature in Fahrenheit to Celsius.   
Sample Output:
Convert temperature in Fahrenheit to Celsius :
---------------------------------------------------
Input the temperature in Fahrenheit : 95
The temperature in Fahrenheit : 95
The temperature in Celsius : 35
*/



import java.util.*;

public class Assign1Prog21{

	public static void main(String []args){
		double f,c;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Convert temperature in Fahrenheit to Celsius :");
		System.out.println("Input the temperature in Fahrenheit : ");
		f=sc.nextDouble();
			c=(f-32)*5/9;

		System.out.println("The temperature in Fahrenheit : "+f);
		System.out.println("The temperature in Celsius : "+c);
		
	}
}