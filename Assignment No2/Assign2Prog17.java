//17)C++ Program to Calculate Power of a Number
import java.util.*;

public class Assign2Prog17 {

	public static int power(int n,int pow) {
		int res=1;
		for(int i=1;i<=pow;i++)
	    {
	        res=res*n;
	    }
		return res;
	}
	
	public static void main(String[] args) {
		
		int x,p;
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter the number :");
		x=cs.nextInt();
		System.out.println("Enter the power :");
		p=cs.nextInt();
		
		System.out.println("Reverse number is :"+power(x,p));

	}

}
