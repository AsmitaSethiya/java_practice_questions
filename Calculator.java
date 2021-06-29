import java.util.Scanner;

class Calculator
{
	public static void main(String[] args)
	{
		int choice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		do
		{
			System.out.println("Press 1 for Addition\n");
			System.out.println("Press 2 for Substraction\n");
			System.out.println("Press 3 for Division\n");
			System.out.println("Press 4 for Modulus\n\n");
			System.out.println("Press 5 for Exit\n");
			
			System.out.println("Enter your choice");
			choice = in.nextInt();
			
			switch(choice)
			{
				case 1:
					int sum = num1 + num2;
					System.out.println("Addition = " + sum);
					break;
				case 2:
					int sub = num1 - num2;
					System.out.println("Substraction = " + sub);
					break;
				case 3:
					int div = num1 / num2;
					System.out.println("Division = " + div);
					break;
				case 4:
					int mod = num1 % num2;
					System.out.println("Modulus = " + mod);
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid choice");
					break;		
			}
			
		}
		
		while(choice != 5);
	}
}

