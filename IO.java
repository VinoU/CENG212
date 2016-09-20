/**
	The import class from the keyboard. All methods are static.
	Liang; Scanner reference is section 2.13, page 52-55; Getting Input from the Console
							 			 section 8.8, page 286-2289; Text I/O
	@author Kenn Baker
	@version June 11, 2014
*/
import java.util.Scanner;

public class IO
{
	/**
		Read a string from the keyboard
		@return String from keyboard
	*/
	public static String readString()
	{
		Scanner in = new Scanner(System.in);	// Opposite to System.out
		String i = in.next();
		return i;
	}
	/** 
		Read an integer from keyboard. Verify/retry for integer
		@return Integer from keyboard 
	*/
	public static int readInt()
	{
		int i = 0;		//Initialize for return
		boolean failure = false;
		Scanner in = new Scanner(System.in);
		do
		{
			failure = false;	//Reinitialize for if
			if (in.hasNextInt())
				i = in.nextInt(); //Good one
			else
			{
				failure = true;
				String temp = in.next();	//Clear the buffer
				System.out.print("Please enter an integer: ");
			}
		}while(failure); 	
		return i;
	}
	/** 
		Read an double from keyboard. Verify/retry for double
		@return Double from keyboard 
	*/
	public static double readDouble()
	{
		double i = -1.0;		//Initialize for return
		boolean failure = false;
		Scanner in = new Scanner(System.in);
		do
		{
			failure = false;	//Reinitialize for if
			if (in.hasNextDouble())
				i = in.nextDouble();		// Good one
			else
			{
				failure = true;
				String temp = in.next();	//Clear the buffer
				System.out.print("Please enter a double: ");
			}
		}while(failure);
		return i;
	}
}