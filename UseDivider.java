/** Application to Calculate the DC voltage with respect to ground at the middle of the two resistor and the *total current
 *File Name - UseDivider.java
* platform Mac Osx
 java version 1.8.0_45
* MY NAME IS VINO UTHAYAKUMAR
* STUDENT NUMBER IS N00673330
* LAB 02 VOLTAGE DIVIDER
*/
import java.util.Scanner;


public class UseDivider{
    //method of test divider class


public static void main(String[] args) {
    
	Scanner input = new Scanner(System.in);

	double initialVol1;
	double initialVol2;
	double initialRes1;
	double initialRes2;

	Divider myDivider = new Divider();
    while (true){
        
	System.out.println("Please enter voltage 1 value: ");
	initialVol1 = input.nextDouble();
        if ( initialVol1 <= 20 && initialVol1 >= -20){
	// pass and set to Divider class
            myDivider.set_vol1(initialVol1);
            break;
        }
    }
    
	// get from Divider class
	myDivider.get_vol1();
    
    
    
    
    while (true) {
        
	System.out.println("Please enter voltage 2 value:");
	initialVol2 = input.nextDouble(); // reading user input
    if ( initialVol2 <= 20 && initialVol2 >= -20){
	myDivider.set_vol2(initialVol2); //setter
        break;}
        
    }
	myDivider.get_vol2();

    
    
    while (true) {
        

    
	System.out.println("Please enter resistor 1 value:");
	initialRes1 = input.nextDouble();
        if( initialRes1 <= 100000 && initialRes1 > 0) {
            
	myDivider.set_res1(initialRes1);
            break;

        }}
	myDivider.get_res1();

        
        
while ( true){
    
	System.out.println("Please enter resistor 2 value:");
	initialRes2 = input.nextDouble();
        if ( initialRes2 <= 100000 && initialRes2 > 0){
	myDivider.set_res2(initialRes2);
            break;
        }
    }
	myDivider.get_res2();

	// display everything
	myDivider.display();
}}
