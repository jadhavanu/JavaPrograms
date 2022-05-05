//1)C++ Program to Add, subtract, multiply and divide Two Numbers

public class Assign2Prog1 {

	public static int add(int x, int y)
	{
		return x+y;
	}
	
	public static int subtract(int x,int y)
	{
		return x-y;
	}
	
	public static int multiply (int x,int y)
	{
		return x*y;
	}
	
	public static int divide (int x, int y)
	{
		return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=25,y=5;
		System.out.println("Addition of "+x+" and "+y+" is = "+add(x,y));
		System.out.println("Subtract of "+x+" and "+y+" is = "+subtract(x,y));
		System.out.println("Multiply of "+x+" and "+y+" is = "+multiply(x,y));
		System.out.println("Division of "+x+" and "+y+" is = "+divide(x,y));
	}

}
