package _03_behavioural._11_template;

public class Chess extends Game {

    private int maxTurns = 10;
    private int turn = 1;

    public Chess() {
        super(2);
    }

    @Override
    protected void start() {
        System.out.println("Starting a game of Chess");
    }

    @Override
    protected boolean haveWinner() {
        return turn == maxTurns;
    }

    @Override
    protected void takeTurn() {
        System.out.println("Turn " + turn++ + " taken by player : " + currentPlayer);
        currentPlayer = (currentPlayer + 1) % noOfPlayers;
    }

    @Override
    protected int getWinningPlayer() {
        return 0;
    }
}
