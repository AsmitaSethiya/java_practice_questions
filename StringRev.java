import java.util.Scanner;
class StringRev
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		String reversedStr = "";
		
		System.out.println("Enter a String: ");
		
		
		String str = in.nextLine();
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			reversedStr = reversedStr + str.charAt(i);
		}
		
		System.out.println("Original String: " + str);
		
		System.out.println("Reverse of given String: " + reversedStr);
	}
}
