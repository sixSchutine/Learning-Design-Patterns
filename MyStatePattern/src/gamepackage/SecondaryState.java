package gamepackage;

public class SecondaryState extends PlayerState {
    public SecondaryState(PlayerState state){
        this.player = state.player;
    }
    @Override
    public void play() {
        System.out.println("当前级别：熟练级");
    }
    @Override
    public void doubleScore() {
        System.out.println("胜利得分双倍！");
    }

    @Override
    public void changeCards() {
        System.out.println("等升级到高手级就可以换牌啦！");
    }

    @Override
    public void peekCards() {
        System.out.println("等升级到骨灰级就可以偷看他人牌啦！");
    }

    @Override
    public int win(int score) {
        System.out.println("赢了！积分加40");
        player.setScore(player.getScore()+40);
        return player.getScore()+40;
    }

    @Override
    public int lose(int score) {
        System.out.println("输了！积分减20");
        player.setScore(player.getScore()-20);
        return player.getScore()-20;
    }

    @Override
    public void levelCheck() {
        if (player.getScore()<100) player.setState(new PrimaryState(this));
        else if (player.getScore()>199) player.setState(new ProfessionalState(this));
    }
}
