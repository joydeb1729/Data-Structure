package com.kucse.score_board;

public class GameEntry {
    private String name;
    private int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public String toString() {
        return "Name : " + this.getName() + "\nScore: " + this.getScore();
    }
}
