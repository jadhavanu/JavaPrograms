//23)C++ Program to Check Whether a Number is Prime or Not

public class CheckPrime {
	
	public static void checkPrime(int n)
	{
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				flag=1;
				break;
		}
		
		if(flag==0)
			System.out.println("Number "+n+" is a prime number");
		else
			System.out.println("Number "+n+" is not a prime number");
			
	}

}
