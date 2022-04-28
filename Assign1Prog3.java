/*3. Write a program in Java to find Size of fundamental data types.   
Sample Output:
Find Size of fundamental data types :
------------------------------------------
The sizeof(char) is : 1 bytes
The sizeof(short) is : 2 bytes
The sizeof(int) is : 4 bytes
The sizeof(long) is : 8 bytes
The sizeof(long long) is : 8 bytes
The sizeof(float) is : 4 bytes
The sizeof(double) is : 8 bytes
The sizeof(long double) is : 16 bytes
The sizeof(bool) is : 1 bytes
*/


public class Assign1Prog3{

	public static void main(String [] args){
	
	System.out.println("The sizeof (char) is : "+(Character.SIZE/8)+" byte");
	System.out.println("The sizeof (short) is : "+(Short.SIZE/8)+" byte");     
	System.out.println("The sizeof (int) is : "+(Integer.SIZE/8)+" byte");
	System.out.println("The sizeof (long) is : "+(Long.SIZE/8)+" byte");
	System.out.println("The sizeof (byte) is : "+(Byte.SIZE/8)+" byte");
	System.out.println("The sizeof (float) is : "+(Float.SIZE/8)+" byte");
	System.out.println("The sizeof (double) is : "+(Double.SIZE/8)+" byte");
	//System.out.println("The sizeof (long double) is : "+(Long Double.SIZE/8)+" byte");
	//System.out.println("The sizeof (bool) is : "+(Boolean.SIZE)+" byte");


}
}