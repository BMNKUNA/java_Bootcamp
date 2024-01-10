import java.util.Scanner;

public class GetInput{ 
     public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What's your full name");        
        String name = in.nextLine();
        System.out.println("Greetings " + name);
    }
}
