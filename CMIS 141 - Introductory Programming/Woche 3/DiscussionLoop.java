/*
* File: DiscussionLoop
* Author: Aidan MacDonald
* Date: July 7, 2018
* Purpose: Discussion Demonstration of Loop
* through the use of time.
*/

// Import the statement required
import java.util.Scanner;

public class DiscussionLoop {	
    public static void main(String[] args)  { 	
	int endHour = 0;
	double days = 0.0;
	
	// The scanner class to take in user's input
	Scanner scannerIn = new Scanner (System.in);
	
	System.out.println("Time to relax!");
	System.out.print("How many hours do you want to wait for? ");
	
	endHour = scannerIn.nextInt();
	days = endHour / 24.0;
	
	// While Loop showing hours waited
	int currentHour=0;
	while (currentHour < endHour) {
	    currentHour = currentHour + 1;
	    System.out.println("You have waited for " + currentHour + " hour(s)");
        }
	
	// Show how much time has passed
	System.out.println(" ");
	System.out.println("You have waited for " + endHour + " hour(s)");
	System.out.println("Which is " + days + " day(s)");
	
	// If/Else Statement depending on user's total days
	if (days < 1.0) {
		System.out.println(" ");
		System.out.println("You did not waste much time.");
		System.out.println("Get back out there!");
		}
	else if (days == 1.0) {
		System.out.println(" ");
		System.out.println("You wasted just enough time.");
		System.out.println("Good job!");
		}
	else {
		System.out.println(" ");
		System.out.println("You have wasted a lot time...");
		System.out.println("Shame.");
		}
	
    }
}