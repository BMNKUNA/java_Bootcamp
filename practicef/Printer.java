
class Printer {
    public static void print(String name, String surname, int age, double miles) {
        System.out.println("Hello " + name + " " + surname);
        System.out.println("You are " + age + " years old.");

        // basic math conversions
        double metersperKM = 1000;
        double secondsperYear = 365* 24 * 60 * 60;
        double millisecondsperSecond = 1000;


        // final calculation outputs
        System.out.println("The distance in meters is: " + (miles * metersperKM));
        System.out.println("The age in seconds is: " + (age * secondsperYear));
        System.out.println("The age in milliseconds is: " + (age * secondsperYear * millisecondsperSecond));
    }
}