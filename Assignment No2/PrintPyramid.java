//28)C++ Programs To Create Pyramid and Pattern


public class PrintPyramid {

	public void printPyramid(int n, char c)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(c);
			System.out.println("");
			
		}
	}
}
