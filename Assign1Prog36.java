/*
36. Write a program in C++ to test the Type Casting.   
Sample Output:
Formatting the output using type casting:
----------------------------------------------
Print floating-point number in fixed format with 1 decimal place:
Test explicit type casting :
0
0.5
0.5
0.0
Test implicit type casting :
0
0
int implicitly casts to double:
4.0
double truncates to int!:
6
*/


public class Assign1Prog36{

	public static void main(String [] args){

	System.out.println("Formatting the output using type casting:");

	System.out.println("Print floating-point number in fixed format with 1 decimal place: ");
  
    System.out.println("Test explicit type casting %.1f:");
    int i1 = 4, i2 = 8;
    System.out.println (i1 / i2);
    System.out.println ((double)i1 / i2 );
    System.out.println (i1 / (double)i2 );
    System.out.println( (double)(i1 / i2));

    double d1 = 5.5, d2 = 6.6;
    System.out.println("Test implicit type casting :") ;
    System.out.println( (int)(d1 / i2 ));
    System.out.println( (int)(d1 / i2));
    System.out.println("int implicitly casts to double: ");
    d1 = i1;
    System.out.println( d1 );
    System.out.println("double truncates to int!: ");
    i2 = (int)d2;
    System.out.println( i2);
    
	}

}