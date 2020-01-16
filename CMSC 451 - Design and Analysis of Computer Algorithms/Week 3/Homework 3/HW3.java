public class HW3 {

	void insertionSort(int array[]) {
		insert(array, 1);
	}
	
	void insert(int[] array, int i) {
		if (i < array.length) {

			int value = array[i];
			int j = shift(array, value, i);

			System.out.println(array[j]); // TEST PRINT
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
		
		int[] array = {4,7,5,3,1};
		HW3 main = new HW3();
		main.insertionSort(array);
	}
	
}