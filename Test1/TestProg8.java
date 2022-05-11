/*
 * 8. Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' 
and address as "not available". It has two functions with the same name 'setInfo'. 
First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address
 respectively. Print the name, age and address of 10 students.
Hint - Use array of objects

 */

public class TestProg8 {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.print();
		Student1 s[]=new Student1[10];
		
		s[1].setInfo("Anuradha",35);
		s[2].setInfo("Tanishka",10);
		s[3].setInfo("Rudransh",11);
		s[4].setInfo("Pravin",15);
		s[5].setInfo("Sambhaji",25);
		
		s[6].setInfo("Anuradha",35,"Pune");
		s[7].setInfo("Tanishka",10,"Latur");
		s[8].setInfo("Rudransh",11,"Mumbai");
		s[9].setInfo("Pravin",15,"Barshi");
		s[0].setInfo("Sambhaji",25,"Akola");
		
		for(int i=0;i<10;i++)
		{
			s[i].print();
		}

	}

}
