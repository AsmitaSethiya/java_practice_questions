import java.util.Scanner;
class StringChar
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a String: " );
		
		String str = in.nextLine();
		
		for(int i = 0; i < str.length(); i++)
		{
			System.out.println("The character at position " + i + " = " + str.charAt(i));
		}
	}
}
