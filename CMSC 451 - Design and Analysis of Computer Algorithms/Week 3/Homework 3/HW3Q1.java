
public class HW3Q1 {

	void insertionSort(int array[]) {
		insert(array, 1);
	}
	
	void insert(int[] array, int i) {
		if (i < array.length) {

			int value = array[i];
			int j = shift(array, value, i);
			array[j] = value;
			insert(array, i + 1);
		}
	}
	
	int shift(int[] array, int value, int i) {
		int insert = i;
		if (i > 0 && array[i - 1] > value) {
			array[i] = array[i - 1];
			insert = shift(array, value, i - 1);
		}
		return insert;
	}

	public static void main(String args[]) {
		
		int[] array = {9,6,4,3,1};
		HW3Q1 main = new HW3Q1();
		main.insertionSort(array);
		
		
		// TEST PRINT
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
