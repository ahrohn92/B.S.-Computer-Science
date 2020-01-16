public class W2D {
	
	int ans = 1;
	
	public int pow(int base, int exp) {
		if (exp == 0) {
			System.out.println(ans); // TEST PRINT
			return 1;
		} else {
			ans = ans * base;
			return base * pow(base, exp - 1);
		}
	}
	
	public static void main(String args[]) {
		
		W2D main = new W2D();
		main.pow(2, 5);
	}
}
