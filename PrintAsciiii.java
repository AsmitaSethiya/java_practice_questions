import java.util.Scanner;
class PrintAsciiii
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		
		char ch = in.next().charAt(0);
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println((int)ch);
		}
	}
}
