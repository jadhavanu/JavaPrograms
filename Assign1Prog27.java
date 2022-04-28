
/*27. Write a program in C++ to convert temperature in Celsius to Kelvin.   
Sample Output:
Convert temperature in Celsius to Kelvin :
---------------------------------------------------
Input the temperature in Celsius : 26.85
The temperature in Celsius : 26.85
The temperature in Kelvin : 300
 
*/

import java.util.*;

public class Assign1Prog27{

	public static void main(String []args){
		double kel,cel;
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Convert temperature in Celsius to Kelvin : ");
		System.out.println("Input the temperature in Celsius : ");
		cel=sc.nextDouble();
		    kel=cel+273.15;

		System.out.println("The temperature in celsius : "+cel);
		System.out.println("The temperature in Kelvin :"+kel);
		
	}
}