import java.util.Scanner;
class String1
{
	public static void main(String[] args)
	{
		String name;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		
		name = in.nextLine();
		
		System.out.println(name);
	}
}
