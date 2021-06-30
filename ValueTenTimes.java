import java.util.Scanner;
class ValueTenTimes
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a value to print 10 times: ");
		int number = in.nextInt();
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(number);
		}
	}
}
