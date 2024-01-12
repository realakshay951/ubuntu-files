import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleLogin {

    private static Map<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        // Populate user database (for demonstration purposes)
        userDatabase.put("user1", "password1");
        userDatabase.put("user2", "password2");

        // Accept user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validate credentials
        if (isValidCredentials(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }

        // Close the scanner
        scanner.close();
    }

    private static boolean isValidCredentials(String username, String password) {
        // Check if the username exists in the database and if the provided password is correct
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}

