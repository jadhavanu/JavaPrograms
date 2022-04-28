
/*26. Write a program in C++ to convert temperature in Fahrenheit to Kelvin.   
Sample Output:
Convert temperature in Fahrenheit to Kelvin :
---------------------------------------------------
Input the temperature in Fahrenheit : 80.33
The temperature in Fahrenheit : 80.33
The temperature in Kelvin : 300
*/


import java.util.*;

public class Assign1Prog26{

	public static void main(String []args){
		double kel,fah;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Convert temperature in Fahrenheit to Kelvin : ");
		System.out.println("Input the temperature in Fahrenheit : ");
		fah=sc.nextDouble();
		    kel=((fah-32)*5)/9+273.15;

		System.out.println("The temperature in Fahrenheit : "+fah);
		System.out.println("The temperature in Kelvin :"+kel);
		
	}
}