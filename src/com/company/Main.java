package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Rock Paper Scissors arena!");
        System.out.println("What is your name, warrior?");
        String username = scanner.nextLine();
        Player player = new Player(username);
        System.out.println("Welcome "+player.getName());

        boolean playerContinue = true;
        while(playerContinue) {
            Move.Options playerChoice = Move.Options.INVALID;
            while (playerChoice == Move.Options.INVALID) {

                System.out.println("Please choose your move [rock,paper,scissors]");
//            String playerChoice = scanner.nextLine();
                playerChoice = Move.parseInput(scanner.nextLine());
            }

            Move.Options computerChoice = Move.randomMove();
//            Move.Options.ROCK
            System.out.println("computer chose " + computerChoice.toString());
            Move.Outcomes turnOutcome = Move.compareWinner(playerChoice, computerChoice);

            if (turnOutcome == Move.Outcomes.DRAW) {
                System.out.println("It's a draw!");
                player.draw();
            }
            if (turnOutcome == Move.Outcomes.PLAYER1) {
                player.win();
                System.out.println("You win!");
            }
            if (turnOutcome == Move.Outcomes.PLAYER2) {
                player.loss();
                System.out.println("You lose!");
            }
            System.out.println(player.getStats());
            System.out.println("would you like to play again?");
            String response = scanner.nextLine();
            if (response.toLowerCase().equals("n"))
                playerContinue = false;
        }



        }



}


//    //        int rockCount =0;
////        int scissorsCount =0;
////        int paperCount=0;
//    int[] counts = new int[3];
////        counts[0]
//        for (int i = 0; i <500;i++){
//        counts[Move.randomMove()]++;
//        }
//        System.out.println(Arrays.toString(counts));