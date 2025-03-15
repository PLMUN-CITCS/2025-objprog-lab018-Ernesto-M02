import java.util.Scanner;

public class EvenOddChecker {

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        // Loop until a valid integer is entered
        while (!validInput) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Enter a valid integer.");
                scanner.next(); 
            }
        }
        return userInput;
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Get integer input from the user
        int number = getIntegerInput();

        // Check if the number is even or odd
        String resultMessage = checkEvenOrOdd(number);

        // Display the result message to the user
        System.out.println(resultMessage);
    }
}