import java.util.Scanner;
class CheckWord
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		
		String str = in.nextLine();
		
		String word = "In";
		
		if(isWordPresent(str, word))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
	
	static boolean isWordPresent(String sentence, String word)
	{
		String[] s = sentence.split(" ");
		
		
		for(String temp : s)
		{
			if(temp.compareTo(word) == 0)
			{
				return true;
			}
		}
		
		return false;
	}
}
