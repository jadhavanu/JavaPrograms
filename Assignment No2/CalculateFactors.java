
//27)C++ Program to Display Factors of a Number

public class CalculateFactors {
	
	public static void factors(int n) {
		int i;
		for(i=2;i<n-1;i++)
		{
			if(n%i==0)
				System.out.print(i+" , ");
		}
	}

}
