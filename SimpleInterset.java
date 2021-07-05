import java.util.Scanner;
class SimpleInterset
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Principal: " );
		int p = in.nextInt();
		
		System.out.println("Enter rate: ");
		int r = in.nextInt();
		
		System.out.println("Enter year: ");
		int year = in.nextInt();
		
		float SI = (float)((p * r * year) / 100);
		
		System.out.println(SI);
	}
}
