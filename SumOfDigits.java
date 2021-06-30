import java.util.Scanner;
class SumOfDigits
{
	public static void main(String[] args)
	{
		int sum = 0 , r, temp;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int num = in.nextInt();
		temp = num;
		
		while(num != 0)
		{
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		
		System.out.println("Sum of digit of " + temp + " is: " + sum);
	}
}
