import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
			
		// ArrayList Initialization
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		
		// Adding Elements to ArrayList
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			arraylist.add(0);
		}
		long runTime = System.nanoTime() - startTime;
		System.out.println("It took "+runTime+" ns to add 1000 elements to the beginning of an ArrayList.");
		
		// Adding Element in Middle of ArrayList
		startTime = System.nanoTime();
		arraylist.add(500, 500);
		runTime = System.nanoTime() - startTime;
		System.out.println("It took "+runTime+" ns to add an element in the middle of an ArrayList of 1000 elements.");
		
		// Accessing Element from ArrayList
		startTime = System.nanoTime();
		arraylist.get(500);
		runTime = System.nanoTime() - startTime;
		System.out.println("It took "+runTime+" ns to access the middle element of an ArrayList of 1000 elements.");
	}
}
