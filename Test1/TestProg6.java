
/*6. Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).
 */
public class TestProg6 {

	int n;
	char c;
	public void print(int n, char c)
	{
		System.out.println("Integer is="+n+" and Character is="+c);
	}
	public void print(char c,int n)
	{
		System.out.println("Character is="+c+" and intger is="+n);
	}
	
	public static void main(String[] args) {

		TestProg6 t=new TestProg6();
		t.print(5, 'a');
		t.print('b', 10);
	}

}
