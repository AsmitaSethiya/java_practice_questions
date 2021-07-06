import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = in.nextLine();
		
		str = str.toLowerCase();
		
		int count = 0;
		
		char[] chars = str.toCharArray();
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
