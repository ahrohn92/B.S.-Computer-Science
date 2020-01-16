/*
 * Course:  	CMIS 242
 * File: 	Sequence.java
 * Author: 	Andrew H. Rohn
 * Date: 	30 September 2018
 * Purpose: 	Utility class that contains methods for Iterative, Recursive,
 * 		and Efficiency computation.
 */

public class Sequence {
	
	// Instance Variable Definition
	private static int efficiency;

	// Initialization of Instance Variable
    public Sequence() {
        efficiency = 0;
    }
  
    // Method for Iterative Computation
    public static int computeIterative(int n) {
        efficiency = 0;
        int[] valueArray = new int[n+1];   
        for(int i = 0; i <= n; i++){
            if (i == 0) {
            	valueArray[i]= 0;
            }
            else if (i == 1) {
            	valueArray[i]=1;
            }
            else {
            	valueArray[i] = (valueArray[i - 1] * 2 + valueArray[i - 2]);
            }
            efficiency++;
            }
        return valueArray[n];
    }

    // Method for Recursive Computation
    public static int computeRecursive(int n) {
    	efficiency = 0;
        return computeRecursiveHelper(n);
    }

    // Helper Methods Extends Recursive Computation
    private static int computeRecursiveHelper(int n) {
        efficiency++;
        if(n <= 1) {
           return n;
        }
        return computeRecursiveHelper(n - 1) * 2 + computeRecursiveHelper(n - 2);  
    }
  
    // Getter Method that Returns Efficiency
    public static int getEfficiency() {
        return efficiency;
    }
}
