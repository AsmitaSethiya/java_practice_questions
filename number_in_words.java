/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int number;
    		
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter a number: ");
    	int a  = in.nextInt();
    	
    	switch(a)
    	{
    	   case 1:
    	        System.out.println("One");
    	        break;
    	   case 2:
    	       System.out.println("Two");
    	       break;
    	   case 3:
    	       System.out.println("Three");
    	       break;
    	   case 4:
    	       System.out.println("Four");
    	       break;
    	   case 5:
    	       System.out.println("Five");
    	       break;
    	   default:
    	        System.out.println("Invalid input.");
    	}
    	
    	}
}
