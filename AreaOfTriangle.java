import java.util.Scanner;
class AreaOfTriangle
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter base of circle: ");
		
		int base = in.nextInt();
		
		System.out.print("Enter height of traingle: ");
		
		int height = in.nextInt();
		
		double area = (base * height) / 2;
		
		System.out.println("Area of triangle is: " + area);
		
	}
}
