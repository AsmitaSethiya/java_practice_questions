import java.util.Scanner;
class Pattern1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a value of n: ");
		
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println("*");
		}
		
	}
}
