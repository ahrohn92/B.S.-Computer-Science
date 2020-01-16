public class q3 {

	// Recursive Function
//	int sum(int[] array, int first, int last) {
//		
//		if (first == last) {
//			// Test Print
////			for (int i = 0; i < array.length; i++)  {
////				System.out.println(array[i]);
////			}
//			System.out.println(array[first]);
//			return array[first];
//		}
//		int mid = (first + last) / 2;
//		
//		System.out.println("MID -> "+mid);
//		return sum(array, first, mid) + sum(array, mid + 1, last);
//	}
//
//	
	
	// Iterative Function
	int sum(int[] array, int first, int last) {
		
        int sum = 0;
        for (int i = first; i <= last; i++) {
        	sum += array[i];
        	System.out.println("Sum -> "+sum);
        }
        System.out.println("Final Sum -> "+sum);
        return sum;
	}
	
	// Main Method
	public static void main(String args[]) {
		
		q3 main = new q3();
		
		// Test Array
		int[] array = {1,2,3,4,5,6,7,8};
		
		main.sum(array, 0, 7);
	}
}