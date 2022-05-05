//32)C++ Program to Check Whether a Number can be Express as Sum of Two Prime Numbers

public class CheckIfPrime {

	public static boolean isPrime(int x) {
		
		boolean flag=true;
        for(int i=2;i<x;i++)
        {
            if((x%i)==0)
                flag=false;
        }
        return flag;

	}
}
