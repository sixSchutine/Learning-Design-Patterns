package gamepackage;

public abstract class PlayerState {
    Player player;

    public abstract void play();
    public abstract void doubleScore();
    public abstract void changeCards();
    public abstract void peekCards();

    public abstract int win(int score);
    public abstract int lose(int score);
    public abstract void levelCheck();
}
