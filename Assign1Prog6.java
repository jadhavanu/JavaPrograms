/*
6. Write a program in C++ to check whether the primitive values crossing the limits or not.   
Check whether the primitive values crossing the limits or not :
--------------------------------------------------------------------
The Gender is : F
Is she married? : 1
Number of sons she has : 2
Year of her appointment : 2009
Salary for a year : 1500000
Height is : 79.48
GPA is 4.69
Salary drawn upto : 12047235
Balance till : 995324987
*/


public class Assign1Prog6{

	public static void main(String [] args){

	 char gender='F';
    	boolean married= true;
    	Short noofson=2;
    	short yearofapp=2009;
   	 int salary=1500000;
   	 float height=79.48f;
    	float gpa=4.69f;
    	int drawnsal= 12047235;
    	long balance=995324987;
	
	System.out.println("Check whether the primitive values crossing the limits or not :");
	System.out.println("The Gender is :"+gender);
	System.out.println("Is she married :"+married);
	System.out.println("Number of sons she has :"+noofson);
	System.out.println("Year of her appointment :"+yearofapp);
	System.out.println("Height is :"+height);
	System.out.println("GPA is :"+gpa);
	System.out.println("Salary drawn upto :"+salary);
	System.out.println("Balance till :"+balance);

}
}