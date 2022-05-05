//25)C++ Program to Check Armstrong Number

public class CheckArmstrong {

	public static void checkArmstrong(int num) {
		int n=num,r=0;
		double arm=0;
		 int count = 0;
		    while (n != 0)
		    {
		        n = n / 10;
		        ++count;
		    }
		    n=num;

		    while(n>0)
		    {
		        r=n%10;
		        n=n/10;
		        arm=arm+ Math.pow(r,count);
		    }

		    if(num==arm)
		        System.out.println("The number "+num+" is an Armstrong Number");
		    else
		        System.out.println("The number "+num+" is not an Armstrong Number");

	}
}
