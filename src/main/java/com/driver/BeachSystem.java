package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeachSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Beach> beaches = new ArrayList<>();
        BeachAnalytics beachAnalytics = new BeachAnalytics();

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBeach(scanner, beaches);
                    break;
                case 2:
                    displayBeaches(beaches);
                    break;
                case 3:
                    Beach mostPopular = beachAnalytics.findMostPopularBeach(beaches);
                    System.out.println("Most Popular Beach: " + mostPopular);
                    break;
                case 4:
                    Beach highestRated = beachAnalytics.findHighestRatedBeach(beaches);
                    System.out.println("Highest Rated Beach: " + highestRated);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Add Beach");
        System.out.println("2. Display Beaches");
        System.out.println("3. Find Most Popular Beach");
        System.out.println("4. Find Highest Rated Beach");
        System.out.println("5. Exit");
    }

    private static void addBeach(Scanner scanner, List<Beach> beaches) {
        System.out.println("Enter Beach Name:");
        scanner.nextLine(); // Consume the newline character
        String name = scanner.nextLine();

        System.out.println("Enter Beach Location:");
        String location = scanner.nextLine();

        System.out.println("Enter Average Yearly Visitors:");
        int yearlyVisitors = scanner.nextInt();

        System.out.println("Enter Beach Rating:");
        double rating = scanner.nextDouble();

        Beach beach = new Beach(name, location, yearlyVisitors, rating);
        beaches.add(beach);

        System.out.println("Beach added successfully!");
    }

    private static void displayBeaches(List<Beach> beaches) {
        System.out.println("Beaches:");

        if (beaches.isEmpty()) {
            System.out.println("No beaches added yet.");
        } else {
            for (Beach beach : beaches) {
                System.out.println(beach);
            }
        }
    }
}
