package com.wabweni.model;

import com.wabweni.model.User;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.entryPoint();
    }

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
                    getUsers();
                    break;
                case 2:
                    getUserById();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 4);

        // Close the scanner
        scanner.close();
    }


    // Method to display all users
    private void getUsers() {
        System.out.println("================================== Users =================================================");
    }

    // Method to display a user by ID
    private void getUserById() {
        System.out.println("================================== User Details ============================================");
    }

    // Method to delete a user by ID
    private void deleteUser() {
       
       System.out.println("================================== User Deleted ============================================");
    }

    // Method to exit the application
    private void exit() {
        System.exit(0);
    }
}
