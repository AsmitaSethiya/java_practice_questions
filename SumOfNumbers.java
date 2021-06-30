import java.util.Scanner;
class SumOfNumbers
{
	public static void main(String[] args)
	{
		int sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			sum = sum + i;
		}			
		
		System.out.println(sum);
	}
}
