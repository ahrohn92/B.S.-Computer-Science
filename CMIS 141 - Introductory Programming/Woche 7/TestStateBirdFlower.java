/*
 * Course:  	CMIS 141
 * File: 	TestStateBirdFlower.java
 * Author: 	Andrew H. Rohn
 * Date: 	8 July 2018
 * Purpose: 	This program displays the state bird and flower for each state.
 */

import java.util.Scanner;

public class TestStateBirdFlower {
	
	public static void main(String[] args) {
    
		StateBirdFlower inform = new StateBirdFlower();
    		String stateName[][] = inform.getStateInfo();
		String searchedStateName[] = new String[stateName.length];
		int count = 0;

    		while (true) {

			// User Input
			Scanner input = new Scanner(System.in);
        		System.out.println("\nEnter a State or 'None' to exit:\n");
			String stateInfoArray = input.nextLine();

			// Java Program Output
        		if (stateInfoArray.trim().equalsIgnoreCase("None")) {
				System.out.println("\n**** Thank You ****");
				System.out.println("A summary report for each State, Bird, and Flower is:");
				
				// Printing Summary of Search Results
				for (int i = 0; i < searchedStateName.length; i++) {
					if (searchedStateName[i] != null) {
						System.out.println(searchedStateName[i]);
					}
				}
				System.out.println("Please visit our site again!");
            			break;
        		} 
			else {
            			int index = getStateIndex(stateInfoArray, stateName);
				if (index != -1) {
                			System.out.printf("\nBird: %s \nFlower: %s \n",
                        		getStateBird(index, stateName), getStateFlower(index, stateName));
				
					// Storing Results for Each Searched State in searchedStateName Array		
					searchedStateName[count] = stateInfoArray+", "+getStateBird(index, stateName)+", "+getStateFlower(index, stateName);
            				count++;
				} 
				else {
                			System.out.println("\nAn invalid state was entered. Please try again.");
            			}
        		}
    		}
	}

	private static int getStateIndex(String stateInfoArray, String[][] stateName) {
    
		for (int i = 0; i < stateName.length; i++) {
        		if (stateInfoArray.trim().equalsIgnoreCase(stateName[i][0])) {
            			return i;
        		}
    		}
    	return -1;
	}

	private static String getStateBird(int index, String[][] stateName) {
    		return stateName[index][1];
	}

	private static String getStateFlower(int index, String[][] stateName) {
    		return stateName[index][2];
	}
}