package lab3;
import java.util.Date;
import java.time.Month;
import java.time.LocalDate;

public class DayLab3Ex9 {
	
	{
		// Get an instance of LocalTime
		// from date
		LocalDate currentDate= LocalDate.parse(date);
		// Get day from date
		int day = currentDate.getDayOfMonth();
		// Get month from date
		Month month = currentDate.getMonth();
		// Get year from date
		int year = currentDate.getYear();
		// Print the day, month, and year
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
	}
	// Driver Code

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given Date
		String date = "2020-07-18";
		// Function Call
		
	}

}
