public class GuessingGame {
    int number;

    static boolean isOver;
    Player player;
    int guess;

    public GuessingGame(Player player,int guess){
        this.player=player;
        this.guess=guess;
    }
}
