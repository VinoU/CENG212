/** Program to calulates the energy needed to heat water from an initial tempreature to a final temperture.*/
import java.util.Scanner;

public class Energy{

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in); // to get user input 

		System.out.println("Enter the amount of water in kilograms: "); 
		double M = input.nextDouble(); //input from user 

		System.out.println("Enter the initial temperture:");
		double initialTemperture = input.nextDouble(); // input from user

		System.out.println("Enter the final temperture:");
		double finalTemperture = input.nextDouble(); // input from user


        double Q = M * ( finalTemperture - initialTemperture ) * 4184;

        System.out.println("energy need to heat water is = " + Q);


	}
}