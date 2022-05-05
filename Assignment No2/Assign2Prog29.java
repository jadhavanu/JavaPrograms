//29)C++ Program to Make a Simple Calculator to Add, Subtract, Multiply or Divide Using switch...case

import java.util.*;

public class Assign2Prog29 {

	public static void main(String[] args) {
		int n1,n2;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter two numbers :");
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide");
		System.out.println("Engter the choice : ");
		c=sc.nextInt();
		SwitchCase obj=new SwitchCase();
		obj.calculator(n1,n2,c);

	}

}
