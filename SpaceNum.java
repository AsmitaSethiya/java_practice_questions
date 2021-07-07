import java.util.Scanner;
class SpaceNum
{
	public static void main(String[] args)
	{
		int space = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = in.nextLine();
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				space++;
			}
		}
		
		System.out.println("No of spaces in Given Sentence: " + str + " are: " + space);
	}
}
