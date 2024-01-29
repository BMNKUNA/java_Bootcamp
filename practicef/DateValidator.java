import java.text.SimpleDateFormat; //java package that formats date as text of a pattern

class DateValidator {
    public static boolean isValid(String dob) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // created new object "formatter" to parse date
        try 
        { 
            formatter.parse(dob); 
            return true;
        }
        catch (Exception e)
        {
        	return false;
        }
    }
}