import java.time.*;
import java.text.SimpleDateFormat;

public class AgeCalculator {
	    // 5. Date of Birth parsing using java package and split method 


	public static int ageCal(String date_of_birth) {

    int BirthYear = Integer.parseInt(date_of_birth.split("/")[2]); 
    int age = 2024 - BirthYear; 
    return age;
    System.out.println("You are " + age + " years old");

	}

}