import java.util.Scanner;
class Pattern6
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			
			System.out.println( );
		}
	}
}
