/*24. Write a program in C++ to convert temperature in Kelvin to Fahrenheit.   
Sample Output:
Convert temperature in Kelvin to Fahrenheit :
---------------------------------------------------
Input the temperature in Kelvin : 300
The temperature in Kelvin : 300
The temperature in Fahrenheit : 80.33
*/

import java.util.*;

public class Assign1Prog24{

	public static void main(String []args){
		double kel,fah;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Convert temperature in Kelvin to Fahrenheit : ");
		System.out.println("Input the temperature in Kelvin : ");
		kel=sc.nextDouble();
		fah=((kel-273.15)*9)/5+32;
		System.out.println("The temperature in Kelvin : "+kel);
		System.out.println("The temperature in Fahrenheit :"+fah);
		
	}
}