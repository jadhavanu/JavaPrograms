/*7. Write a program in C++ to display various type or arithmetic operation using mixed data type.   
Sample output:
Display arithmetic operations with mixed data type :
---------------------------------------------------------
5 + 7 = 12
3.7 + 8.0 = 11.7
5 + 8.0 = 13.0
5 - 7 = -2
3.7 - 8.0 = -4.3
5 - 8.0 = -3.0
5 * 7 = 35
3.7 * 8.0 = 29.6
5 * 8.0 = 40.0
5 / 7 = 0
3.7 / 8.0 = 0.5
5 / 8.0 = 0.6
*/

public class Assign1Prog7{

	public static void main(String [] args){

	  int n1=5, n2=7;
   	  float f1=3.7f, f2=8.0f;
   	  System.out.println("Display arithmetic operations with mixed data type :");
	  System.out.println(n1+" + "+n2+" = "+(n1+n2));
	  System.out.println(f1+" + "+f2+" = "+(f1+f2));
	  System.out.println(n1+" + "+f2+" = "+(n1+f2));
	  System.out.println(n1+" - "+n2+" = "+(n1-n2));
	  System.out.println(f1+" - "+f2+" = "+(f1-f2));
	  System.out.println(n1+" - "+f2+" = "+(n1-f2));
	  System.out.println(n1+" * "+n2+" = "+(n1*n2));
	  System.out.println(f1+" * "+f2+" = "+(f1*f2));
	  System.out.println(n1+" * "+f2+" = "+(n1*f2));
	  System.out.println(n1+" / "+n2+" = "+(n1/n2));
	  System.out.println(f1+" / "+f2+" = "+(f1/f2));
	  System.out.println(n1+" / "+f2+" = "+(n1/f2));

}
}