/*7. Create a class to print the area of a square and a rectangle. The class has two functions with the 
same name but different number of parameters. The function for printing the area of rectangle has two 
parameters which are its length and breadth respectively while the other function for printing the area 
of square has one parameter which is the side of the square.
*/

public class TestProg7 {

	int side;
	int len, brd;
	int area;
	public int area(int n)
	{
		side=n;
		area=4*side;
		return area;
	}
	public int area(int l,int b)
	{
		len=l;
		brd=b;
		area=len*brd;
		return area;
	}

	public static void main(String[] args) {

		TestProg7 t=new TestProg7();
		System.out.println("Area of Square is="+t.area(5));
		System.out.println("Area of Rectangle is="+t.area(5,6));
	}

}
