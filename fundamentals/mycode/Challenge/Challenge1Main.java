import java.util.Scanner; // Import of user input package
import java.text.SimpleDateFormat; /* package that takes in dateformat and
                                    reads it in text and converts it in simple date format
                                    Did not use it due to "parseInt" built in function */

import java.util.Date; // datetime library that goes with utilities(util) framework
import java.time.Year; //Time library used                                    
import java.time.Duration; // Time library used to count time in seconds

public class Challenge1Main { //Main point where methods will be called
  public static void main(String[] args) { // starting point of programme execution:

  	/* Code is executed in secuence
  	as per numbering */
  	// 1. Name promter
    Scanner in = new Scanner(System.in); 
 

    // 2. Surname promter


    // 3. Date of Birth promter  

    // 4. Distance promter


    // 5. Date of Birth parsing using java package and split method 
    int BirthYear = Integer.parseInt(date_of_birth.split("/")[2]); 
    int age = 2024 - BirthYear; 
    System.out.println("You are " + age + " years old");

    // 6. Distance Conversion
    double Distance_from_store_in_miles = Integer.parseInt(distance_from_store)*0.62;
    int Distance_in_meters= Integer.parseInt(distance_from_store)*1000;
    System.out.println("The distance from the store is "+Distance_from_store_in_miles+" "+ "miles");

    System.out.println("The distance from the store in meters is "+ Distance_in_meters);

    // 7. Age Conversion 
    //In seconds
    int age_in_seconds = age*31536000;
    System.out.println("Your age in seconds is :" +age_in_seconds+"seconds");
    //In milliseconds
    int age_in_milliseconds = age_in_seconds*1000;
    System.out.println("Your age in milliseconds is :" +age_in_milliseconds+"milliseconds");


  }
}
