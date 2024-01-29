public class NumberValidator {
	static Boolean numVal(String distance) { 
        
    try {

        int store_distance = Integer.parseInt(distance);

        return true;
    } catch (NumberFormatException e) {
        return false;

	    }
    }
}
