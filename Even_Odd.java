import java.util.*;
public class Even_Odd
{
	public static void main(String[] args)
	{
    		
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter a number: ");
        int	number  = in.nextInt();
    	
        if(number % 2 == 0)
        {
            System.out.println(number + " is a Even number");
        }
        else
        {
            System.out.println(number + " is a odd number");
        }
    	
    	}
}
