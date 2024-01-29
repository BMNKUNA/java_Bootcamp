import java.text.SimpleDateFormat;

public class DateValidator extends NumberValidator {
	static Boolean dateVal(String dob) { 
          
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
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