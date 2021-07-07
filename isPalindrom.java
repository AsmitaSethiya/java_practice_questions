import java.util.Scanner;
class PalindromStr
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = in.nextLine();
		
		
		if(isPalindrom(str))
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is not Palindrom");
		}
	}
	
	
	static boolean isPalindrom(String str)
	{
		int i = 0, j = str.length() - 1;
		
		while(i < j)
		{
			if(str.charAt(i) != str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}	
	
	
}
