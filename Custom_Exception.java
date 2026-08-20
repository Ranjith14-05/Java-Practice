//A custom exception is an exception created by the programmer for a specific application requirement. We create it by extending Exception or RuntimeException

class InvalidAgeException extends Exception {

    // Constructor
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Custom_Exception {
    // Method that checks age
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("You are eligible to vote");
    }

    public static void main(String[] args) {

        int age = 16;

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
