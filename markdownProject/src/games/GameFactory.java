package games;

public class GameFactory {
    public static Playable getGame(String arg){
        if(arg.equalsIgnoreCase("poker")){
            return new Poker();
        }else if(arg.equalsIgnoreCase("hearts")){
            return new Hearts();
        }
        return null;
    }
}
