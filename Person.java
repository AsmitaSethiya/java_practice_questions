import java.util.Scanner;
class Person
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		
		String name = in.nextLine();
		
		System.out.println("Your name is: " + name);

	}
}
