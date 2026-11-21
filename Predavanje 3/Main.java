import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Create an array to store dogs (up to 5 dogs)
        Dog[] shelter = new Dog[2];
        int dogCount = 0; // Keeps track of how many dogs have been added

        // Main program loop
        while (true) {
            // Display menu options
            System.out.println("Dog Shelter Management System");
            System.out.println("1. Add a dog");
            System.out.println("2. List all dogs");
            System.out.println("3. Remove a dog");
            System.out.println("4. Search for a dog");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Handle the user's choice
            if (choice == 1) {
                // Add a new dog if the shelter isn't full
                if (dogCount < shelter.length) {
                    System.out.print("Enter dog name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter dog age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    System.out.print("Enter dog breed: ");
                    String breed = scanner.nextLine();
                    boolean postoji = false;
                    for (int i = 0; i < dogCount; i++) {
                        if (shelter[i].name.equalsIgnoreCase(name)) {
                            postoji = true;
                            break;
                        }
                    }
                    if (postoji == true) {
                        System.out.print("Pas sa tim imenom vec postoji. ");
                        continue;
                    }
                    // Create a new dog object and store it in the array
                    shelter[dogCount] = new Dog(name, age, breed);
                    dogCount++; // Increase the dog count
                    System.out.println("Dog added successfully!\n");
                } else {
                    System.out.println("Shelter is full. No more dogs can be added.\n");
                }
            } else if (choice == 2) {
                // List all the dogs if there are any
                if (dogCount > 0) {
                    System.out.println("Listing all dogs:");
                    for (int i = 0; i < dogCount; i++) {
                        System.out.println("Dog " + (i + 1) + ":");
                        shelter[i].printDetails(); // Print the details of each dog
                        System.out.println(); // Add a blank line for readability
                    }
                } else {
                    System.out.println("No dogs in the shelter.\n");
                }
            } else if (choice == 3) {
                System.out.println("Type the name of the dog that you want to remove:");
                String name = scanner.nextLine();

                boolean pronadjen = false;

                for (int i = 0; i < dogCount; i++){
                    if (shelter[i].name.equalsIgnoreCase(name)) {
                        for (int j = i; j < dogCount - 1; j++){
                            shelter[j] = shelter[j + 1];
                        }
                        dogCount--;
                        shelter[dogCount] = null;
                        pronadjen = true;
                        System.out.println("you removed the dog called: " + name);
                        break;
                    }
                }
                if (pronadjen == false) {
                    System.out.println("The dog called " + name + " was not found.");
                }
            }  else if (choice == 4) {
                System.out.println("Type the name of the dog that you want to search:");
                String name = scanner.nextLine();

                Boolean pronadjen = false;
                for (int i = 0; i < dogCount; i++){
                    if (shelter[i].name.equalsIgnoreCase(name)) {
                        shelter[i].printDetails();
                        pronadjen = true;
                        break;
                    }
                }
                if (pronadjen == false) {
                    System.out.println("The dog called " + name + " was not found.");
                }
            }

                else if (choice == 5) {
                // Exit the program
                System.out.println("Exiting the system. Goodbye!");
                break;
            } else {
                // Handle invalid choices
                System.out.println("Invalid option. Please try again.\n");
            }
        }
    }
}
