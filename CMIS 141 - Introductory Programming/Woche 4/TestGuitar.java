/*
 * Course:  	CMIS 141
 * File: 	TestGuitar.java
 * Author: 	Andrew Rohn
 * Date: 	17 June 2018
 * Purpose: 	This program demonstrates the use of fields, methods, and constructors in Java.
 */

import java.util.Scanner;
import java.util.Random;

public class TestGuitar {
  
   	public static void main(String args[]) {

		// Guitar Constructors	
       		Guitar guitarNumberOne = new Guitar();
       		Guitar guitarNumberTwo = new Guitar(6, 34.6, "Yamaha", "Blue");
       		Guitar guitarNumberThree = new Guitar(7, 30.2, "Fender", "Black");

   		// User Input/Output
		int guitarSelection;
		Scanner input = new Scanner(System.in);
       		System.out.print("There are three guitars currently available. To see their specifications");
       		System.out.println(" and to test them, press either 1, 2, or 3.");
		guitarSelection = input.nextInt();
	
		if (guitarSelection == 1) {
       			printGuitar(guitarNumberOne);
		}
       		else if (guitarSelection == 2) {
			printGuitar(guitarNumberTwo);
		}
       		else if (guitarSelection == 3) {
			printGuitar(guitarNumberThree);
		}

   	}
  	
	// Final Output
   	public static void printGuitar(Guitar guitar) {
		System.out.println("***Output***");
       		System.out.println("toString() : " + guitar.toString());
       		System.out.println("getNumStrings() : " + guitar.getNumStrings());
       		System.out.println("getGuitarLength() : " +guitar.getGuitarLength());
       		System.out.println("getGuitarColor() : " +guitar.getGuitarColor());
       		System.out.print("playGuitar() : " + guitar.playGuitar() + "\n\n");
   	}
}

class Guitar {
	
	// Private Fields for Guitar Constructor
   	private int numStrings;
   	private double guitarLength;
   	private String guitarManufacturer;
   	private String guitarColor;
  
	// Default Guitar Constructor
   	public Guitar() {
       	numStrings = 6;
       	guitarLength = 28.2;
       	guitarManufacturer = "Gibson";
       	guitarColor = "Red";
   	}
  	
	// Guitar Contructor	
   	public Guitar(int numStrings, double guitarLength, String guitarManufacturer, String guitarColor) {
       		super();
       		this.numStrings = numStrings;
       		this.guitarLength = guitarLength;
       		this.guitarManufacturer = guitarManufacturer;
       		this.guitarColor = guitarColor;
   	}

	// Fields of Guitar Contructor
   	public int getNumStrings() {
       		return numStrings;
   	}
  	public void setNumStrings(int numStrings) {
       		this.numStrings = numStrings;
  	}
   	public double getGuitarLength() {
       		return guitarLength;
   	}
  	public void setGuitarLength(double guitarLength) {
       		this.guitarLength = guitarLength;
   	}
  	public String getGuitarManufacturer() {
       		return guitarManufacturer;
   	}
  	public void setGuitarManufacturer(String guitarManufacturer) {
       		this.guitarManufacturer = guitarManufacturer;
   	}
   	public String getGuitarColor() {
       		return guitarColor;
   	}
   	public void setGuitarColor(String guitarColor) {
       		this.guitarColor = guitarColor;
   	}
	
	// Generation of Random Notes and Duration
   	public String playGuitar() {
       		Random randomGenerator = new Random(System.currentTimeMillis());
       		String[] guitarNotes = {"A", "B", "C", "D", "E", "F", "G"};
       		String[] noteDurations = {"0.25", "0.5", "1", "2", "4"};
      
       		StringBuilder musicalNote = new StringBuilder("[");
       		for (int i=1; i<17; i++) {
           	musicalNote.append(guitarNotes[randomGenerator.nextInt(7)] + "("
                       + noteDurations[randomGenerator.nextInt(5)] + "),");
       		}
      		return musicalNote.replace(musicalNote.length()-1, musicalNote.length(), "]").toString();
   	}
   	@Override
   	public String toString() {
       		return " [numStrings=" + numStrings + ", guitarLength=" + guitarLength + ", guitarManufacturer="
               		+ guitarManufacturer + ", guitarColor=" + guitarColor + "]";
   	}
}