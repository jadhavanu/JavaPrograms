/*12. Write a program in C++ to add two numbers accept through keyboard.   
Sample Output:
Original array:
[10, 20, 30]
After append values to the end of the array:
[10 20 30 40 50 60 70 80 90]
*/

public class Assign1Prog12{

	public static void main(String [] args){

	int n1=10,n2=20,sum,i;
	int num[];
	num=new int[15];
	
	num[0]=n1;
	num[1]=n2;
	System.out.println("After appending array is :");
	System.out.println("");
	System.out.print(n1+" "+n2);
	for(i=2;i<15;i++){
		sum=n2+10;
		num[i]=sum;
		System.out.print(" "+num[i]);
		n1=n2;
		n2=sum;
		}
	}
}

