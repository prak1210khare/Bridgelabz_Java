/*Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
        Hint =>
        The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
        Create a Method to find the Computer Choice using the Math.random
        Create a Method to find the winner between the user and the computer
        Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
        Create a Method to display the results of every game and also display the average and percentage wins
        In the main take user input for the number of games and call methods to display results
Auhtor: Prakhar Khare
Date:28-09-2026
 */
package javaStrings.level2;
import java.util.Scanner;
public class RockPaper {
    // Method to find computer's choice
    public static int getComputerChoice() {
        return (int) (Math.random() * 3) + 1;
    }

    // Method to convert choice number into choice name
    public static String getChoiceName(int choice) {
        if (choice == 1) {
            return "Rock";
        } else if (choice == 2) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    // Method to find the winner
    public static String findWinner(int userChoice, int computerChoice) {

        if (userChoice == computerChoice) {
            return "Draw";
        }

        if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            return "Player";
        }

        return "Computer";
    }

    // Method to calculate wins and percentages
    public static String[][] calculateStatistics(
            int playerWins, int computerWins, int draws, int totalGames) {

        double playerPercentage =
                (playerWins * 100.0) / totalGames;

        double computerPercentage =
                (computerWins * 100.0) / totalGames;

        double[][] dummy = new double[1][1];

        String[][] statistics = new String[2][3];

        statistics[0][0] = "Player";
        statistics[0][1] = String.valueOf(playerWins);
        statistics[0][2] = String.format("%.2f%%", playerPercentage);

        statistics[1][0] = "Computer";
        statistics[1][1] = String.valueOf(computerWins);
        statistics[1][2] = String.format("%.2f%%", computerPercentage);

        return statistics;
    }

    // Method to display results
    public static void displayResults(
            String[][] gameResults,
            String[][] statistics,
            int draws) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer\t\tComputer\tWinner");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println(
                    (i + 1) + "\t"
                            + gameResults[i][0] + "\t\t"
                            + gameResults[i][1] + "\t\t"
                            + gameResults[i][2]
            );
        }

        System.out.println("\nStatistics:");
        System.out.println("Player\tWins\tWinning Percentage");
        System.out.println("--------------------------------");

        for (int i = 0; i < statistics.length; i++) {
            System.out.println(
                    statistics[i][0] + "\t"
                            + statistics[i][1] + "\t"
                            + statistics[i][2]
            );
        }

        System.out.println("Draws = " + draws);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter number of games: ");
        int numberOfGames = input.nextInt();

        String[][] gameResults = new String[numberOfGames][3];

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        // Play multiple games
        for (int i = 0; i < numberOfGames; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("Enter your choice: ");

            int userChoice = input.nextInt();

            // Validate user choice
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                i--;
                continue;
            }

            // Get computer choice
            int computerChoice = getComputerChoice();

            // Find winner
            String winner = findWinner(userChoice, computerChoice);

            // Store game result
            gameResults[i][0] = getChoiceName(userChoice);
            gameResults[i][1] = getChoiceName(computerChoice);
            gameResults[i][2] = winner;

            // Update statistics
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        // Calculate statistics
        String[][] statistics = calculateStatistics(
                playerWins,
                computerWins,
                draws,
                numberOfGames
        );

        // Display results
        displayResults(gameResults, statistics, draws);

        input.close();
    }
}
