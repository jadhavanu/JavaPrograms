//6)C++ Program to Check Whether a character is Vowel or Consonant.
import java.util.*;

public class Assign2Prog6 {

	public static void checkchar(char c)
	{
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='o'||c=='O'||c=='i'||c=='I'||c=='u'||c=='U')
			System.out.println("Character "+c+" is a Vowel");
		else
			System.out.println("Character "+c+"is a consonant");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enetr the character to check for vowel : ")
		checkchar('g');
	}

}
