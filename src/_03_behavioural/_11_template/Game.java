package _03_behavioural._11_template;

public abstract class Game {

    protected int currentPlayer;
    protected final int noOfPlayers;

    public Game(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    protected abstract void start();

    protected abstract boolean haveWinner();

    protected abstract void takeTurn();

    protected abstract int getWinningPlayer();


    public void run() {
        // Below is the skeleton algorithm
        start();
        while (!haveWinner()) {
            takeTurn();
        }
        System.out.println("Player " + getWinningPlayer() + " wins!!!");
    }
}
