//32)C++ Program to Check Whether a Number can be Express as Sum of Two Prime Numbers

public class SumPrime {

	public void checkSumOfPrime(int n)
	{
		int n1,i,flag=1;
		for(i=2;i<=n/2;i++) {
		if(CheckIfPrime.isPrime(i))
		{
			if(CheckIfPrime.isPrime(n-i))
			{
				System.out.println("Number "+n+" can be represented as sum of two prime numbers: "+i+" and "+(n-i));
				flag=0;
			}
		}
		}
		if(flag==1)
			System.out.println("Number "+n+" can not be represented as sum of two prime numbers:");
	}
}
