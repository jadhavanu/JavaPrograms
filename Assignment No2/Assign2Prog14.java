//14)C++ Program to Find GCD

import java.util.*;

public class Assign2Prog14 {

	public int gcd(int num1,int num2) {
		int i,gcd=1;
		for(i=2;(i<=num1)&&(i<=num2);i++)
	    {
	        if(((num1%i)==0)&&((num2%i)==0))
	        {
	            gcd=i;
	            //cout<<"\n"<<gcd;
	        }
	    }
	    return gcd;
	    
	}
	public static void main(String[] args) {
		 int n1,n2,ans;
		 Scanner sc=new Scanner(System.in);
		 Assign2Prog14 myObj=new Assign2Prog14();
			System.out.println("Enter the numbers to calculate GCD : ");
			System.out.print("1st number:");
			n1=sc.nextInt();
			System.out.print("2nd number:");
			n2=sc.nextInt();
			ans=myObj.gcd(n1,n2);
			System.out.println("GCD :"+ans);
			
	}

}
