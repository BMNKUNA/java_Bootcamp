import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class DateValidator extends Promter {
	public static boolean dateValidation(String date_of_birth ) {
	SimpleDateFormat dateFormat = new SimpleDateFormat(dd/MM/yyyy);
	 if (date_of_birth.dateFormat(dd/MM/yyyy)); {
		System.out.println("Date format is valid");
        }
	else {
		System.out.println("Date format invalid");
	}
	}
}