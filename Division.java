import java.util.Scanner;
class Division
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int num1 = in.nextInt();
		
		System.out.print("Enter number 2: ");
		int num2 = in.nextInt();
		
		int div = num1 / num2;
		
		System.out.println(div);
	}
}
