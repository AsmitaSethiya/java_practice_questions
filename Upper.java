import java.util.Scanner;
class Upper
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = in.nextLine();
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
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
