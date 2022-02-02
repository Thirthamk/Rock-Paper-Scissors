package com.company;

public class Player {
    private String name;
    private int wins;
    private int draws;
    private int losses;
    private int longestStreak;
    private int currentStreak;

    public Player(String name){
        this.name = name;
        draws=0;
        losses =0;
        longestStreak = 0;
        currentStreak =0;
    }

    public String getName(){
        return name;
    }
    public void win(){
        wins++;
        currentStreak++;
        if(currentStreak>longestStreak)
            longestStreak = currentStreak;
    }

    public void loss(){
        losses++;
        currentStreak =0;
    }

    public void draw(){
        draws++;
    }

    public String getStats(){
        return String.format("Player stats: WINS:%d LOSSES:%d DRAWS:%d CURSTREAK:%d RECORD:%d",wins,losses,draws,currentStreak,longestStreak);
    }

}
