

//15)C++ Program to Find LCM
import java.util.Scanner;
public class Assign2Prog15 {

	public static void main(String[] args) {
		 int n1,n2,ans;
		 Scanner sc=new Scanner(System.in);
		 Assign2Prog15 myObj=new Assign2Prog15();
			System.out.println("Enter the numbers to calculate LCM : ");
			System.out.print("1st number:");
			n1=sc.nextInt();
			System.out.print("2nd number:");
			n2=sc.nextInt();
			ans=myObj.lcm(n1,n2);
			System.out.println("LCM :"+ans);
	}
		public int lcm(int n1,int n2) {
			int lcm;
	    if(n1>n2)
	        lcm=n1;
	    else
	        lcm=n2;

	    
	    do
	    {
	        if (lcm % n1 == 0 && lcm % n2 == 0)
	        {
	            System.out.println(lcm);
	            break;
	        }
	        else
	            ++lcm;
	    } while (true);

	    return lcm;
	}

}
