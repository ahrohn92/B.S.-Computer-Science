import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
			
		// LinkedList Initialization
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		
		// Adding Elements to LinkedList
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			linkedlist.add(0);
		}
		long runTime = System.nanoTime() - startTime;
		System.out.println("It took "+runTime+" ns to add 1000 elements to the beginning of a LinkedList.");
		
		// Adding Element in Middle of LinkedList
		startTime = System.nanoTime();
		linkedlist.add(500, 500);
		runTime = System.nanoTime() - startTime;
		System.out.println("It took "+runTime+" ns to add an element in the middle of a LinkedList of 1000 elements.");
		
		// Accessing Element from LinkedList
		long startTime1 = System.nanoTime();
		linkedlist.get(500);
		runTime = System.nanoTime() - startTime1;
		System.out.println("It took "+runTime+" ns to access the middle element of a LinkedList of 1000 elements.");

	}
}
