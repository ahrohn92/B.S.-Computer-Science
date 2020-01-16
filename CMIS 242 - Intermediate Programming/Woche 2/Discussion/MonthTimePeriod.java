public class MonthTimePeriod extends WeekTimePeriod {

	// Instance Variables
	private String numDays = "30";
	private String timePeriod = "month";

	// Subclass Constructor
	public MonthTimePeriod() {
		super(); // Calls the constructor from Superclass, which calls the toString method from Superclass
	}
	// toString Method that overrides Superclass Method
	private void toStringg() {
		System.out.println("There are "+numDays+" days in a "+timePeriod);
	}
	public static void main(String[] args) {
		MonthTimePeriod subclass = new MonthTimePeriod();
		subclass.toStringg(); // Calls the toString method from Subclass
	}
}