import java.util.Scanner;

public class Challenge1Main {
    public static void main(String[] args) { //Start of programme execution
        //1
        String name = Prompter.prompt("What is your name:");
        //2
        String surname = Prompter.prompt("What is your surname:");
        //3
        String dob = Prompter.prompt("What is your date of birth? DD/MM/YYYY : ");
        //4
        String distance = Prompter.prompt("How far is your favourite store from your home: ");

        // 5.0
        boolean dateValid = DateValidator.isValid(dob); // Declaring dateValid var as boolean for if statements
        boolean numberValid = NumberValidator.isValid(distance);
        
        int age = 0; // initialising age and declaring default value 0
        double miles = 0; //doing the same as above to prevent compilation error "can't find symbol" 
        //  5.1
        if (dateValid) {
            int birthYear = Integer.parseInt(dob.split("/")[2]);
            age = AgeCalculator.calculate(birthYear);

        } else {
            System.out.println("Date is not valid, Exiting!");

        }
        // 5.2
        if (numberValid) {
        	int number = Integer.parseInt(distance);
        	miles = number; 
        	numberValid = true;
        	            // Call Printer to print greeting
            Printer.print(name, surname, age, miles);
       } else {
       	   System.out.println("Distance is not Valid,Exiting"); 
       }
    }
}
