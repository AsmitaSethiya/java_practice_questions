import java.util.Scanner;
class String2
{
	
	public static void main(String[] args)
	{
		String lname , fname;
		
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter First name: ");
		fname = in.nextLine();
		
		System.out.println("Enter Last Name: ");
		lname = in.nextLine();
		
		System.out.println(fname + " "+ lname);
	}
	
}
