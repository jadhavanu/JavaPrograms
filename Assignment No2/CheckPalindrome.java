
public class CheckPalindrome {

	public int reverseNum(int x)
	{
		int r,rev=0;
		if(x>0)
		{
			r=x%10;
			x=x/10;
			rev=(rev*10)+r;			
		}
		return rev;
	}
	
	public void checkPalindrome(int x ) {
		if(x==reverseNum(x))
		{
			System.out.println("Number "+x+"is a palindrome");
			
		}
		else
			System.out.println("Number "+x+"is not a palindrome");
	}
}

