import java.util.Scanner;
class Pattern5
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
