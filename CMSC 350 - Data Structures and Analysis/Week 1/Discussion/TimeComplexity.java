import java.util.Scanner;

public class TimeComplexity {

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("\nEnter a number: \n");
			int num = input.nextInt();
			
			long startTime = System.nanoTime();
			int sum = 0;
			for (int i = num; i > 0; i--) {
				sum += i;
			}
			long endTime = System.nanoTime() - startTime;
			
			System.out.println("\nSum: "+sum);
			System.out.println("RunTime: "+endTime+" ns");
		}

	}
}
