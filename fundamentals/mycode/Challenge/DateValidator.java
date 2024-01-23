import java.text.SimpleDateFormat;

public class DateValidator extends NumberValidator {
	Boolean dateVal(String dob) { 
          
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
        
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