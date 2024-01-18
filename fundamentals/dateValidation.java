import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateValidator {

    public static boolean dateValidation(String dateOfBirth) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // This will make the date validation stricter

        try {
            dateFormat.parse(dateOfBirth);
            System.out.println("Date format is valid");
            return true;
        } catch (ParseException e) {
            System.out.println("Date format is invalid");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date of birth (dd/MM/yyyy): ");
        String inputDate = scanner.next();
        dateValidation(inputDate);
    }
}
