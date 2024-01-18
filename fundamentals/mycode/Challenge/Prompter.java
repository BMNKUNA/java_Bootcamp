import java.util.Scanner;

public class Prompter extends Challenge1Main {
    public static promts(String[] args) {
    // Start of execution
    Scanner in = new Scanner(System.in);
    // 1
    System.out.println("What is your name:");
    String Name = in.nextLine();
    // 2
    System.out.println("What is your surname:");
    String Surname = in.nextLine();
    // 3  
    Year year = new Year.now();
    System.out.println("Enter your date of birth (DD/MM/YYYY):"); /* must be called from Date.Validator via
                                                                   with conditional statement in separate class */
    String date_of_birth = in.nextLine();   
    // 4
    System.out.println("How far is your favorite store from your home?"); // Numeric validator still needed for cases of wrong input
    String distance_from_store = in.nextLine();
    // 5





    }
}