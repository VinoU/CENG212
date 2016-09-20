/**
	ComputeArea.java
	Originally from page 29 of Liang
	@version June 11, 2014
*/
public class ComputeArea
{
	public static void main(String[] args)
	{
		char char_r = 'r';	//declare and define a character
		double area;			// declare area
		double radius;			// declare radius
		radius =1;				// define radius
		// Following line: calculate area; note precedence
		area = (radius * radius) * 3.14;
		// Following line: concatenation of output string	
		System.out.println("Area for " + char_r + "=" + radius + " = " + area);
		radius += 1;		// addition assignment operator
		area = (radius * radius) * 3.14;
		System.out.println("Area for " + char_r + "=" + radius + " = " + area);
		radius++;			// incremental operator
		area = (radius * radius) * 3.14;
		System.out.println("Area for " + char_r + "=" + radius + " = " + area);
		int rad_2_int = (int)radius + 1;	// casting from double to integer
		final double PI = 3.14;		// final constant
		area = rad_2_int * rad_2_int * PI; 
		System.out.println("Area for " + char_r + "=" + rad_2_int + " = " + area);
		area = Math.pow(rad_2_int,2.0) * Math.PI;	// Using the Math class
		System.out.println("Area for " + char_r + "=" + rad_2_int + " = " + area);
		if (rad_2_int <= 2) 		// if statement w/ single line then
			System.out.println("T: Area for " + char_r + "=" + rad_2_int + " = " + area);
		else			// multi-line else
		{
			rad_2_int++;
			area = Math.pow(rad_2_int,2.0) * Math.PI;
			System.out.println("F: Area for " + char_r + "=" + rad_2_int + " = " + area);
		}
		while (rad_2_int < 10)		// while statement
		{
			int newRad;
			rad_2_int++;	
			// Following line: note pre-increment
			newRad = (rad_2_int == 8) ? ++rad_2_int : rad_2_int;
			area = Math.pow(newRad,2.0) * Math.PI;	
			// Following line: formatted print 
			System.out.printf("While: Area for %c=%d  = %6.2f \n", char_r, newRad, area);
		}
		for (int i = 0; i < 3; i++)		// i is a local variable valid only for the for
		{
			area = i * i * Math.PI;
			System.out.printf("For: Area for r=%d  = %6.2f \n", i, area);
		}			
	}
} 