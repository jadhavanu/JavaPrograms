/*2.Create a class named 'Rectangle' with two data members- length and breadth and a function to
calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
*/
import java.util.*;
public class TestProg2 {

	public static void main(String[] args) {

		Rectangle r1=new Rectangle();
		r1.Area();
		Rectangle r2=new Rectangle(5);
		r2.Area();
		Rectangle r3=new Rectangle(4,3);
		r3.Area();
	}

}
