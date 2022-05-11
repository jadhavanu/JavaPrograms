
public class Student1 {

	int age; 
	String name,address;
	
	Student1()
	{
		name="Unknown";
		age=0;
		address="not available";
	}
	public void setInfo(String s, int a)
	{
		name=s;
		age=a;
	}
	public void setInfo(String s, int a, String addr)
	{
		name=s;
		age=a;
		address=addr;
	}
	public void print()
	{
		System.out.println("name="+name+" age="+age+" address="+address);
	}
}
