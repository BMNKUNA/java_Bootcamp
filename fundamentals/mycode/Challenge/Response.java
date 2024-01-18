import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Response { 
    public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("What is your name:");
    String Name = in.nextLine(); //Takes in the user input
    System.out.println("What is your surname:");
    String Surname = in.nextLine();
    System.out.println("Hello"+" "+ Name +" "+ Surname);
    }
}