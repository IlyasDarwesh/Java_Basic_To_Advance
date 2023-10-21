import java.util.Random;
import java.util.Scanner;

public class Project1_Rock_Paper_Scissor_Game {


    public static void main(String[] args) {
        /*
         1. The Rock beats the Scissors  (rock crushes scissors)
         2. The Scissors beats the Paper (scissors cut paper)
         3. The Paper beats the Rock
         You might be wondering about 3rd point, how the paper beats the rock.
         The answer is, paper can cover the rock and hence beats it.
         4. If both players create the same formation then the game is a tie or draw.
         5. There should be at least 2 players required to play this game.

                        --> computer and human return one by one
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        // Getting input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");

        // Print results
        if (playerMove.equals(computerMove)) {
            System.out.println("It's a draw!");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }




    }


    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }



    }



