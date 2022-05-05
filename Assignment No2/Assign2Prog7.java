//7)C++ Program to Find Largest Number Among Three Numbers

import java.util.*;
public class Assign2Prog7 {

	public static void greater(int x,int y,int z)
	{
		if((x>y)&&(x>z))
		{
				System.out.println(x+" is largest amoung three numbers");
		}
		else if((y>z)&&(y>x))
				System.out.println(y+" is largest amoung three numbers");
		else
				System.out.println(z+" is greater amoung three numbers");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		greater(x,y,z);
	}

}
