import java.util.Scanner;
class Pattern7
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int n = in.nextInt();
		
		for(int i = 65; i < 65 + n; i++)
		{
			for(int j = 65; j <= i; j++)
			{
				System.out.print((char)j);
			}
			
			System.out.println( );
		}
	}
}
