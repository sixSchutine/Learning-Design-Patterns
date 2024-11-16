package gamepackage;

public class ProfessionalState extends PlayerState {
    public ProfessionalState(PlayerState state){
        this.player = state.player;
    }
    @Override
    public void play() {
        System.out.println("当前级别：高手级");
    }
    @Override
    public void doubleScore() {
        System.out.println("胜利得分双倍！");
    }
    @Override
    public void changeCards() {
        System.out.println("拥有换牌权限！");
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
        if (player.getScore()<200) player.setState(new SecondaryState(this));
        else if (player.getScore()>399) player.setState(new FinalState(this));
    }
}
