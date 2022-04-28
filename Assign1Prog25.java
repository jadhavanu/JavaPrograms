/*25. Write a program in C++ to convert temperature in Kelvin to Celsius.   
Sample Output:
Convert temperature in Kelvin to Celsius :
------------------------------------------------
Input the temperature in Kelvin : 300
The temperature in Kelvin : 300
The temperature in Celsius : 26.85
*/

import java.util.*;

public class Assign1Prog25{

	public static void main(String []args){
		double kel,cel;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Convert temperature in Kelvin to Celsius : ");
		System.out.println("Input the temperature in Kelvin : ");
		kel=sc.nextDouble();
		    cel=kel-273.15;

		System.out.println("The temperature in Kelvin : "+kel);
		System.out.println("The temperature in Celsius :"+cel);
		
	}
}