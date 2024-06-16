import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        // Created a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // Ask the user to enter their current age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        // Calculate the number of characters in the surname
        int surnameLength = surname.length();

        // Determine if the age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";

        // Print the results
        System.out.println("The number of characters in your surname is: " + surnameLength);
        System.out.println("Your current age is an " + ageType + " number.");

        // Close the scanner
        scanner.close();
    }
}
