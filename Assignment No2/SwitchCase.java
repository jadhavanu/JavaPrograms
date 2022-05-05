//29)C++ Program to Make a Simple Calculator to Add, Subtract, Multiply or Divide Using switch...case

public class SwitchCase {

	public void calculator(int n1,int n2,int c)
	{
			switch ( c)
		{
		case 1:
			System.out.println("Addition is : "+(n1+n2));
			break;
		case 2:
			System.out.println("Subtraction is : "+(n1-n2));
			break;
		case 3:
			System.out.println("Multiplication is : "+(n1*n2));
			break;
		case 4:	
			System.out.println("Division is : "+(n1/n2));
			break;
		default:
			System.out.println("you have entered wrong choice:");
		}
	}
}
