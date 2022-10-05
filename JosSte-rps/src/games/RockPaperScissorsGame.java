package games;

public class RockPaperScissorsGame {

    Player player;
    Fist aIFirst;

    RockPaperScissorsGame(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        aIFirst = new Fist();
    }

    public static void main(String[] args) {
        RockPaperScissorsGame game = new RockPaperScissorsGame("marcus", 0);
        game.playGame();
    }

    void playGame() {
        System.out.println(player.getName());

    }
}
