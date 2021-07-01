import java.util.Scanner;
class Pattern3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter value of n: ");
		
		int n = in.nextInt();
		
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 2; j++)
			{
				System.out.print("**");
			}
			
			System.out.println( );
		}
	}
}
