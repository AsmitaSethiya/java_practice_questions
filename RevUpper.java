import java.util.Scanner;
class RevUpper
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		
		String str = in.nextLine();
		
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev += str.charAt(i);
		}
		
		for(int i = 0; i < rev.length(); i++)
		{
			char ch = rev.charAt(i);
			
			if(ch >= 97 && ch <= 122)
			{
				System.out.print((char)(ch - 32));
			}
			else
			{
				System.out.print(ch);
			}
		}

	}
}
