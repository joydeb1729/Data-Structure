package com.kucse.score_board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a ScoreBoard with a capacity of 5
        ScoreBoard scoreboard = new ScoreBoard(5);

        // Create a scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player names and scores. Type 'exit' to quit.");

        while (true) {
            System.out.print("Enter player name: ");
            String name = scanner.nextLine();
            
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter player score: ");
            int score = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Add new GameEntry to the scoreboard
            GameEntry entry = new GameEntry(name, score);
            scoreboard.add(entry);

            // Display the top 3 scorers
            System.out.println("\nTop 3 scorers:");
            displayTopScorers(scoreboard);
        }

        scanner.close();
    }

    // Method to display the top 3 scorers
    public static void displayTopScorers(ScoreBoard scoreboard) {
        int count = 0;
        for (int i = 0; i < scoreboard.getTotalEntry() && count < 3; i++) {  // Loop for top 3 scorers
            GameEntry entry = scoreboard.getEntry(i);
            if (entry != null) {
                System.out.println((i + 1) + ". " + entry.getName() + " - " + entry.getScore());
                count++;
            }
        }
    }
}
