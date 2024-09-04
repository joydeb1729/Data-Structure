package com.kucse.score_board;


public class ScoreBoard {
    private int totalEntry = 0;
    private GameEntry[] board;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e) {
        int newScore = e.getScore();

        if (totalEntry < board.length || newScore > board[totalEntry - 1].getScore()) {
            if (totalEntry < board.length) {
                totalEntry++;
            }
            int lastIndex = totalEntry - 1;

            while (lastIndex > 0 && board[lastIndex - 1].getScore() < newScore) {
                board[lastIndex] = board[lastIndex - 1];
                lastIndex--;
            }
            board[lastIndex] = e;
        }
    }

    public GameEntry remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= totalEntry) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        GameEntry removedEntry = board[index];

        for (int i = index; i < totalEntry - 1; i++) {
            board[i] = board[i + 1];
        }
        board[totalEntry - 1] = null;
        totalEntry--;

        return removedEntry;
    }

    public int getTotalEntry() {
        return totalEntry;
    }

    public GameEntry getEntry(int index) {
        if (index >= 0 && index < totalEntry) {
            return board[index];
        }
        return null;
    }
}
