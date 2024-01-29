class NumberValidator {
    // returns value based on numeric validity
    public static boolean isValid(String distance) {

    try {

        int number = Integer.parseInt(distance);
        return true;
    } catch (NumberFormatException e) { // helps handles errors during attempts in number conversion
        return false;

        }
    }
}