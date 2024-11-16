package gamepackage;

public class Player {
    public PlayerState state;
    public int score = 0;

    public int getScore() {
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }

    public Player() {
        this.state = new PrimaryState(this); // 默认入门级
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play();
    }

    public void doubleScore() {
        state.doubleScore();
    }

    public void changeCards() {
        state.changeCards();
    }

    public void peekCards() {
        state.peekCards();
    }
    public int win(int score){
        state.win(score);
        return score;
    }
    public int lose(int score){
        state.lose(score);
        return score;
    }
    public void levelCheck(){
        state.levelCheck();
    }
}
