/*37. Write a program in C++ to print a mystery series from 1 to 50.   
Sample Output:
Print a mystery series:
-------------------------
The series are:
5 4 2 7 11 10 8 13 17 16 14 19 23 22 20 25 29 28 26 31 35 34 32 37 41 4 0 38 43 47 46 44 49
*/

public class Assign1Prog37{

	public static void main(String [] args){

	int x;
	System.out.println("Print a mystery series : ");
	
	for(int i=1;i<=25;i++){
		 x = (int)(Math.random() * 50);
		System.out.print(x+" ");
		}
	}
}