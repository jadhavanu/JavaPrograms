/*5. Write a program in C++ to check the upper and lower limits of integer.   
Expected Output:
Check the upper and lower limits of integer :
--------------------------------------------------
The maximum limit of int data type : 2147483647
The minimum limit of int data type : -2147483648
The maximum limit of unsigned int data type : 4294967295
The maximum limit of long long data type : 9223372036854775807
The minimum limit of long long data type : -9223372036854775808
The maximum limit of unsigned long long data type : 18446744073709551615
The Bits contain in char data type : 8
The maximum limit of char data type : 127
The minimum limit of char data type : -128
The maximum limit of signed char data type : 127
The minimum limit of signed char data type : -128
The maximum limit of unsigned char data type : 255
The minimum limit of short data type : -32768
The maximum limit of short data type : 32767
The maximum limit of unsigned short data type : 65535
*/


public class Assign1Prog5{

	public static void main(String []args){

	System.out.println("Upper and lower limits of data types : ");
	System.out.println("The maximum limit of int data type : "+(Integer.MAX_VALUE));
	System.out.println("The minimum limit of int data type : "+(Integer.MIN_VALUE));
	//System.out.println("The maximum limit of unsigned int data type : "+(UnsignedInteger.MAX_VALUE));
	System.out.println("The minimum limit of long data type : "+(Long.MIN_VALUE));
	System.out.println("The maximum limit of long data type : "+(Long.MAX_VALUE));
	//System.out.println("The minimum limit of unsigned long data type : "+(Long.MIN_VALUE));
	System.out.println("The maximum limit of char data type : "+(Character.MAX_VALUE));
	System.out.println("The minimum limit of char data type : "+(Character.MIN_VALUE));
	//System.out.println("The maximum limit of signed char data type : "+(Character.MAX_VALUE));
	//System.out.println("The minimum limit of signed char data type : "+(Character.MIN_VALUE));
	//System.out.println("The maximum limit of unsigned char data type : "+(Character.MAX_VALUE));
	System.out.println("The minimum limit of short data type : "+(Short.MIN_VALUE));
	System.out.println("The maximum limit of short data type : "+(Short.MAX_VALUE));
	//System.out.println("The minimum limit of unsigned short data type : "+(Short.MIN_VALUE));
	System.out.println("The maximum limit of Float data type : "+(Float.MAX_VALUE));
	System.out.println("The minimum limit of Float data type : "+(Float.MIN_VALUE));
	System.out.println("The maximum limit of Double data type : "+(Double.MAX_VALUE));
	System.out.println("The minimum limit of Double data type : "+(Double.MIN_VALUE));
	
}
}