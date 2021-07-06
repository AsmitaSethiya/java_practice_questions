import java.util.Scanner;
class CountChar
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter  a String: ");
		
		String str = in.nextLine();
		
		str = str.toLowerCase();
		
		//char[] chars = str.toCharArray();
		
		System.out.print("Enter a character: ");
		
		char ch = in.next().charAt(0);
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ch)
			{
				count++;
			}
		}
		
		System.out.println("Count = " + count);
	}
}
