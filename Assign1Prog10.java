/*10. Write a program in C++ to formatting the output.   
Sample Output:
Formatting the output :
----------------------------
The value of pi : 3.1416
The value of pi 4 decimal place of total width 8 : | 3.1416|
The value of pi 4 decimal place of total width 10 : | 3.1416|
The value of pi 4 decimal place of total width 8 : |--3.1416|
The value of pi 4 decimal place of total width 10 : |----3.1416|
The value of pi in scientific format is : 3.1416e+00
Status in number : 0
Status in alphabet : false
*/

public class Assign1Prog10{

	public static void main(String [] args){
	
	float pi=3.1416f;
	System.out.println("Formatting the output :");
	System.out.println("The value of pi :"+pi);
	System.out.println("The value of pi 4 decimal place of total width 8 : |%.4f\n"+pi+"|");
}

}