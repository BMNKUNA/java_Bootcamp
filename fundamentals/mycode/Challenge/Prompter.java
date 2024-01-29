import java.util.Scanner;
import java.time.Year;

public  class Prompter extends DateValidator {
    
    public static void prompts() {
    // Start of execution
    Scanner in = new Scanner(System.in);
    // 1
    System.out.println("What is your name:");
    String Name = in.nextLine();
    // 2
    System.out.println("What is your surname:");
    String Surname = in.nextLine();
    // 3  
    System.out.println("Enter your date of birth (DD/MM/YYYY):"); /* must be called from Date.Validator via
                                                                   with conditional statement in separate class */
    
    String date_of_birth = in.nextLine(); 
    Boolean ValidDate = false;
    
    while (!ValidDate) {
        date_of_birth = in.nextLine();

        DateValidator call2 = new DateValidator();

        if (call2.dateVal(date_of_birth)) {
            System.out.println(" Date Valid");
            ValidDate = true;
            }
            else {
            System.out.println("Invalid date format!\nPlease enter re-enter date using example format 01/01/2024");

            }
        }

        
    

    // 4
    System.out.println("How far is your favorite store from your home?"); // Numeric validator still needed for cases of wrong input
    Boolean ValidNumber = false;
    while(!ValidNumber) {
    String distance_from_store = in.nextLine();
    

        NumberValidator call3 = new NumberValidator();
        if (call3.numVal(distance_from_store)) {
            System.out.println("Distance Valid");
            ValidNumber = true;
        } else {
            System.out.println("Distance is not valid!\nEnter the distance in numbers per KM");
        }

    }

    { /*AgeCalculator call4 = new AgeCalculator();
    call4.AgeCalculator();*/

    }

}

    // 5 

}
