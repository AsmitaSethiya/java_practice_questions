import java.util.Scanner;
class DigitSum1
{
	public static void main(String[] args)
	{
		int r, sum = 0;
		
		Scanner in = new Scanner(System.in);
			
		System.out.println("Enter a number: ");
		
		int num = in.nextInt();
		
		while(num != 0)
		{
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		
		System.out.println(sum);
	}
}
