import java.util.Scanner;
class Area1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int length =  in.nextInt();
		
		System.out.println("Enter width: ");
		int width = in.nextInt();
		
		int area = width * length;
		
		System.out.println("Area is: " + area);
		
		
	}
}
