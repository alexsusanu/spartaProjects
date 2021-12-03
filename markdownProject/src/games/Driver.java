package games;

public class Driver {
    public static void main(String[] args) {
        Playable playGame = GameFactory.getGame("poker");
        playGame.play();
    }
}
