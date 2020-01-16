import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SortedPriorityQueue<T> {
	
	  // Declare an object of ArrayList type.
	  private ArrayList<T> sortedList;
	 
	  // Default Constructor for Sorted List
	  SortedPriorityQueue() {
		  sortedList = new ArrayList<T>();
	  }
	 
	  // Adds Value to Sorted List
	  public void add(T value) {
		  
		  // If Queue is Empty, Add Value
		  if (sortedList.size() == 0) {
			  sortedList.add(value);
		  // Else Find Ordered Position, Add Value,
		  // And Shift Following Values
		  } else {
			  T x = value;
			  for (int i = 0; i < sortedList.size(); i++) {
				  if (sortedList.get(i).toString().compareTo(x.toString()) < 0) {
					  x = sortedList.get(i);
					  sortedList.set(i,value);
					  value = x;
				  }
			  }
			  sortedList.add(x);
		  }
	  }
	 
	  // Removes Last Index from List
	  public T remove() {
		  T x = sortedList.remove(sortedList.size() - 1);
	      return x;
	  }

	  // Given Algorithm from Question 4 for Sorting an Integer Array
	  static void sort(int[] array) {
	       
	      SortedPriorityQueue<Integer> spq = new SortedPriorityQueue<Integer>();
	      for (int i = 0; i < array.length; i++) {
	    	  spq.add(array[i]);
	      }
	      for (int i = 0; i < array.length; i++) {
	    	  array[i] = spq.remove();
	      }
	  }
	 
	  // Main Method
	  public static void main(String[] args) {
		  
		  // Generates Test Array with Random Integers (0-9)
		  int[] array = new int[8];
		  for (int i = 0; i < array.length; i++) {
			  array[i] = ThreadLocalRandom.current().nextInt(0, 10);
		  }
		  
		  // OUTPUT BEFORE SORT
		  System.out.println("Array BEFORE Sorting: ");
		  System.out.println(Arrays.toString(array)+"\n");
		  
		  // OUTPUT AFTER SORT
		  sort(array);
		  System.out.println("Array AFTER Sorting: ");
		  System.out.println(Arrays.toString(array));
	  }
}
