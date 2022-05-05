//25)C++ Program to Check Armstrong Number

public class CheckArmstrongRange {
	
		public void checkArmstrong(int n1,int n2) {
			for(int i=n1;i<=n2;i++) {
		int n=i,r=0;
		double arm=0;
		 int count = 0;
		    while (n != 0)
		    {
		        n = n / 10;
		        ++count;
		    }
		    n=i;

		    while(n>0)
		    {
		        r=n%10;
		        n=n/10;
		        arm=arm+ Math.pow(r,count);
		    }

		    if(i==arm)
		        System.out.println("The number "+i+" is an Armstrong Number");
			
		}
	}

}
