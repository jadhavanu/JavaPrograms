

public class CheckPrimeRange {

	public void checkPrime(int n1,int n2)
	{

		for (int j=n1;j<=n2;j++)
		{
			int flag=0;
		
		for(int i=2;i<j;i++)
		{
			if(j%i==0) {
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Number "+j+" is a prime number");
		}	
	}

}
