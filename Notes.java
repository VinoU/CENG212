/**
	File Name: Notes.java
	Musical Scales Project: A program that calculates the frequencies on a musical scale.
	@author Vinokkumar Uthayakumar
	Course Number: CENG 212-ONA
	Email: thkv0018@humbermail.ca
	Platform: Mac OSX
	Java Version: 1.8.0_45
	@version October 2nd, 2016
*/
//Import statements
import java.lang.*;
import java.text.*;
import java.util.*;

/** Notes class to declare variables for middle C, the other notes and the frequencies for all of the notes.
@param middleC Variable for middle C and to use in @param setmiddleC
@param semitone Array for frequencies
@param noteName Array for note names
*/
public class Notes 
{
	private double middleC;
	private double[] semitone = new double[13];
	private String[] noteName = { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C'" };

/** @param Notes Used to set @param middleC to 260 Hz.
*/   
	public Notes() 
	{
		this.middleC = 260.00;
	}

/** @param Notes Assigns @param middleC to declared (in method) variable middleC.
Uses a if-else statement to check middle C frequency limits before assignment.
*/	
	public Notes(double middleC) 
	{
		if(middleC >= 250.00 && middleC <= 270.00) 
		{
			this.middleC = middleC;
		}
		else
		{
		System.out.println("Invalid frequency.");
		}	
	}
	
/** @param setmiddleC set @param middleC as declared variable middleC
*/
	public void setmiddleC(double middleC) 
	{
		this.middleC = middleC;
	}

/** @param getsemitone Used to get the array values for @param semitone
@return Once values are gotten
*/	
	public double[] getsemitone() 
	{
		return Arrays.copyOf(semitone, semitone.length);
	}

/** @param getnotName Used to get array values for @param noteName
@return Once values are gotten
*/	 
	public String[] getnoteName() 
	{
		return Arrays.copyOf(noteName, noteName.length);
	}

/** @param calculateValues Uses for loop, @param middleC and @param Math.pow to get frequency values for @param semitone
*/	
	public void calculateValues() 
		{
			for(int i = 0; i < 13; i++) 
			{
				semitone[i] = middleC * Math.pow( 2, ((double)i/ 12) );
			}
		}
/** @param displayValues Prints out @param noteName and @param semitone to screen
@param NumberFormat Used to access DecimalFormat to three decimal places
*/	
	public void displayValues() 
	{
      NumberFormat dF = new DecimalFormat("##0.000"); 
		System.out.println("Here are the note names and frequency values: ");
		System.out.println("Notes          Frequencies"); 
		for(int i = 0; i < 13; i++) 
		{
			System.out.println(noteName[i] + "              " + dF.format(semitone[i]) + " Hz"); 
		} 
	}

/** @param searchNote Linear search method to find corresponding @param semitone to user-inputted @param noteName
Uses for loops, a while loop, and if statements. Option to exit out of method.
@return when @param noteFrequency (a copy of @param semitone) is found
*/	
	public void searchNote() 
	{
		String exitKey = "";
		String[] noteNameSearch = noteName;
      double noteFrequency = 0;
      NumberFormat dF = new DecimalFormat("##0.000");
		
		while(!exitKey.equals( "x" )) 
		{
			System.out.print("Please enter the note name to find its frequency: ");
        	String userInput = IO.readString();
			
        	for(String note : noteNameSearch) 
         {
        	  		if(note.equalsIgnoreCase(userInput)) 
				   {
               				for(int i = 0; i < noteNameSearch.length; i++) 
					            {
                  				if(noteNameSearch[i].equalsIgnoreCase(userInput)) 
						            {
                     					noteFrequency = semitone[i];
						            }	
               				}
               				System.out.println("The frequency for " + note + " is: " + dF.format(noteFrequency));
        				         return;
        			}
        	}
    		System.out.println("Invalid note");
	      System.out.println("Please enter x to exit.");
	      exitKey = IO.readString();
      }
	}

/** @param main Puts @param Notes and @param calculateValues together to test method.
*/
	public static void main(String[] args) 
	{
		Notes myNotes = new Notes();
		myNotes.calculateValues();
	}
}
