/**
	UseNotes.java
	Musical Scales Project: A program to calculate the frequency of a musical scale.
	@author Vinokkumar Uthayakumar
	Course Number: CENG 212-ONA
	Email: thkv0018@humbermail.ca
	Platform: Mac OSX
	Java Version: 1.8.0_45
	@version October 2nd, 2016
*/
// Import statements
import java.lang.*;
import java.text.*;
import java.util.*;

/** UseNotes class tests the Notes.java function.
@see Notes.java for information on methods.
@param testnotes This is used to calculate and display the note names and frequency values with the middle C value as 260 Hz.
@param testFrequency Used to calculate and display note names and frequency values with user inputted middle C frequency. Also used to test linear search function. 
*/
public class UseNotes 
{
	
	public static void main(String[] args) 
	{
		String exitKey = "";
		Notes testnotes = new Notes();
		testnotes.calculateValues();
		testnotes.displayValues();
			System.out.print("Please enter a new value for middle C: ");
			double middleCInput = IO.readDouble();
		
			Notes testFrequency = new Notes(middleCInput);
			testFrequency.calculateValues();
			testFrequency.displayValues();
			testFrequency.searchNote();
	}	
}
