import java.util.Scanner; // input package

class Prompter {
    public static String prompt(String message) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(message + "");
        return scanner.nextLine();
    }
}