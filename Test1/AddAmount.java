
public class AddAmount {
	int amount=50;
	
	AddAmount()
	{
		System.out.println(" No amount is added to piggie bank initial amount is :$"+amount);
	}
	AddAmount(int amt)
	{
		amount=amount+amt;
		System.out.println("After adding amount to piggie bank new amount is :$"+amount);
	}

}
