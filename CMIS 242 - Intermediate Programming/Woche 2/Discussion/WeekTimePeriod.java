public class WeekTimePeriod {
	
	// Instance Variables
	private String numDays = "7";
	private String timePeriod = "week";
	
	// Superclass Constructor
	public WeekTimePeriod() {
		toStringg();
	}

	private void toStringg() {
		System.out.println("There are "+numDays+" days in a "+timePeriod);
	}
}