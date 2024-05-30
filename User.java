import java.util.*;

public class User {
    // Fields to store user information
    public int id;
    public String firstName;
    public String lastName;
    public String username;
    public String dob;

    // Constructor to initialize User objects
    public User(int id, String firstName, String lastName, String username, String dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.dob = dob;
    }

    // Main entry point of the application
    public void entryPoint() {
        Scanner scanner = new Scanner(System.in);
        int option;

        // Loop to keep displaying the menu until the user chooses to exit
        do {
            // Display the menu options
            System.out.println("\n================================== User Management System ==================================\n");
            System.out.println("1. Get Users");
            System.out.println("2. Get User by ID");
            System.out.println("3. Delete User");
            System.out.println("4. Exit");
            System.out.println("\n===============================================================================================\n");

            // Read the user's choice
            option = scanner.nextInt();

            // Perform actions based on the user's choice
            switch (option) {
                case 1:
                    // Option to display all users
                    getUsers();
                    break;
                case 2:
                    // Option to get a specific user by ID
                    System.out.println("Enter user ID:");
                    int userId = scanner.nextInt();
                    getUserById(userId);
                    break;
                case 3:
                    // Option to delete a user by ID
                    System.out.println("Enter user ID:");
                    int deleteUserId = scanner.nextInt();
                    deleteUser(deleteUserId);
                    break;
                case 4:
                    // Option to exit the application
                    exit();
                    break;
                default:
                    // Invalid option handling
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 4);

        // Close the scanner
        scanner.close();
    }

    // Method to add and return a list of users
    public List<User> addUsers() {
        // Creating sample users
        User user1 = new User(1, "John", "Doe", "johndoe", "01/01/1981");
        User user2 = new User(2, "Jane", "Doe", "janedoe", "01/01/1982");
        User user3 = new User(3, "Jim", "Doe", "jimdoe", "01/01/1983");
        // Returning a list of users
        return List.of(user1, user2, user3);
    }

    // Method to display all users
    public void getUsers() {
        List<User> users = addUsers();
        System.out.println("================================== Users ==========================================================");
        // Print each user's details
        for (User u : users) {
            System.out.println(u.id + " " + u.firstName + " " + u.lastName + " " + u.username + " " + u.dob);
        }
        System.out.println("====================================================================================================");
    }

    // Method to display a user by ID
    public void getUserById(int id) {
        List<User> users = addUsers();
        boolean userFound = false;
        // Iterate through the list to find the user with the given ID
        for (User u : users) {
            if (u.id == id) {
                System.out.println("================================== User ==================================================");
                System.out.println(u.id + " " + u.firstName + " " + u.lastName + " " + u.username + " " + u.dob);
                System.out.println("===========================================================================================");
                userFound = true;
                break;
            }
        }
        // If user is not found, display a message
        if (!userFound) {
            System.out.println("User not found");
        }
    }

    // Method to delete a user by ID
    public void deleteUser(int id) {
        List<User> users = addUsers();
        System.out.println("================================== Remaining Users ===============================================");
        // Print the details of users who are not the one to be deleted
        for (User u : users) {
            if (u.id != id) {
                System.out.println(u.id + " " + u.firstName + " " + u.lastName + " " + u.username + " " + u.dob);
            }
        }
        System.out.println("==================================================================================================");
    }

    // Method to exit the application
    public void exit() {
        System.exit(0);
    }
}
