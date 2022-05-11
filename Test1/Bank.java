/*10. A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a function 'getBalance' which returns 0. 
Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a function with the same 
name 'getBalance' which returns the amount deposited in that particular bank. 
Call the function 'getBalance' by the object of each of the three banks.
*/

public class Bank {
	int balance=0;
	public class BankA
	{
		int balance=1000;
		public void getBalance() {
			System.out.println("Balance in BankA is :$"+balance);
		}		
	}
	public class BankB
	{
		int balance=1500;
		public void getBalance() {
			System.out.println("Balance in BankB is:$ "+balance);
		}
	}
	
	public class BankC
	{
		int balance=2000;
		public void getBalance() {
			System.out.println("Balance in BankC is :$"+balance);
		}
	}
	public void getBalance() {
		System.out.println("Balance in Bank is"+balance);
	}
	

	public static void main(String[] args) {
		Bank b=new Bank();
		b.getBalance();
		//		//Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
		
		Bank.BankA ba= b. new BankA();
		Bank.BankB bb= b. new BankB();
		Bank.BankC bc= b. new BankC();
		
		ba.getBalance();
		bb.getBalance();
		bc.getBalance();
		

	}

}
