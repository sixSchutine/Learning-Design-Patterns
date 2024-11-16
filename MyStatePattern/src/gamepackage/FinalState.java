package gamepackage;

public class FinalState extends PlayerState {
    public FinalState(PlayerState state){
        this.player = state.player;
    }
    @Override
    public void play() {
        System.out.println("当前级别：骨灰级");
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
        System.out.println("解锁偷看他人牌的特权！");
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
        if (player.getScore()<400) player.setState(new ProfessionalState(this));
    }
}
