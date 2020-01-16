/*
 * Course:  	CMIS 141
 * File: 	USCrime.java
 * Author: 	Andrew H. Rohn
 * Date: 	15 July 2018
 * Purpose: 	This program reads a file containing data related to the U.S. Crime statistics from 1994-2013
 *              and displays the population growth in percentages for each consecutive year, the years with
 *              the maximum and minimum murder rates, and the maximum and minimum robbery rates.
 */

public class USCrime {

    // Private field definition
	private int year;
	private int population;
	private int murder;
	private double murderRate;
	private int robbery;
	private double robberyRate;

    // Split read file lines into fields
	public USCrime(String line) {
		String[] split = line.split(",");
		setYear(Integer.parseInt(split[0]));
		setPopulation(Integer.parseInt(split[1]));
		setMurder(Integer.parseInt(split[4]));
		setMurderRate(Double.parseDouble(split[5]));
		setRobbery(Integer.parseInt(split[8]));
		setRobberyRate(Double.parseDouble(split[9]));
	}
	
	// Fields for methods
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getMurder() {
		return murder;
	}
	public void setMurder(int murder) {
		this.murder = murder;
	}
	public double getMurderRate() {
		return murderRate;
	}
	public void setMurderRate(double murderRate) {
		this.murderRate = murderRate;
	}
	public int getRobbery() {
		return robbery;
	}
	public void setRobbery(int robbery) {
		this.robbery = robbery;
	}
	public double getRobberyRate() {
		return robberyRate;
	}
	public void setRobberyRate(double robberyRate) {
		this.robberyRate = robberyRate;
	}
}
