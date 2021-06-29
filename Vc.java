import java.util.Scanner;

class Vc
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a charater from a to z to check whether it is Vowel or Conconant");
		
		char ch = in.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
		{
			System.out.println(ch + " is a Vowel");
		}
		else
		{
			System.out.println(ch + " is a Consonant");
		}
	}
}
