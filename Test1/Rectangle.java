
public class Rectangle {
	int length, breadth,area;
	
	Rectangle()
	{
		length=breadth=0;
	}
	Rectangle(int val)
	{
		length=breadth=val;
	}
	Rectangle(int v1,int v2)
	{
		length= v1;
		breadth=v2;
	}
	
	public void Area()
	{
		area=length*breadth;
		System.out.println("Area of Rectangle with length="+length+" and breadth= "+breadth+" is= "+area);
	}
	
	

}
