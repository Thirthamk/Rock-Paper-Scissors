package com.company;

import java.util.Random;

public class Move {
    enum Options {
        ROCK,
        PAPER,
        SCISSORS,
        INVALID
    }
    enum Outcomes{
        PLAYER1,
        PLAYER2,
        DRAW,
        INVALID
    }
    static Options[] choice = {Options.ROCK, Options.PAPER,Options.SCISSORS};
    static Random random = new Random();

    public static Options randomMove(){

        return choice[random.nextInt(3)];
    }



    public static Options parseInput(String input) {
        input = input.toLowerCase();
        if (input.equals("rock") || input.equals("r")) {
            return Options.ROCK;
        }
        if (input.equals("paper") || input.equals("p")) {
            return Options.PAPER;
        }
        if (input.equals("scissors") || input.equals("s")) {
            return Options.SCISSORS;
        }
        return Options.INVALID;
    }
    public static Outcomes compareWinner(Options player1, Options player2){

        if(player1 == player2){
            return Outcomes.DRAW;

        }if(player1 == Options.ROCK){
            if (player2 == Options.SCISSORS)
                return Outcomes.PLAYER1;
            else return Outcomes.PLAYER2;
        }if(player1 == Options.PAPER){
            if (player2 == Options.SCISSORS)
                return Outcomes.PLAYER2;
            else return Outcomes.PLAYER1;
        }if(player1 == Options.SCISSORS){
            if (player2 == Options.ROCK)
                return Outcomes.PLAYER2;
            else return Outcomes.PLAYER1;
        }
        return Outcomes.INVALID;
    }


}


//        if(player1 == Options.INVALID ||player2==Options.INVALID){
//            return "invalid";
//        }