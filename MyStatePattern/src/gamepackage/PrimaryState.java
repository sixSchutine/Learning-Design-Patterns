package gamepackage;

public class PrimaryState extends PlayerState {
    public PrimaryState(Player player){
        this.player = player;
    }
    public PrimaryState(PlayerState state){
        this.player = state.player;
    }


    @Override
    public void play() {
        System.out.println("当前级别：入门级");
    }

    @Override
    public void doubleScore() {
        System.out.println("等升级到熟练级就可以胜利得分双倍啦！");
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
        System.out.println("赢了！积分加20");
        player.setScore(player.getScore()+20);
        return player.getScore()+20;
    }

    @Override
    public int lose(int score) {
        System.out.println("输了！积分减20");
        player.setScore(player.getScore()-20);
        return player.getScore()-20;
    }

    @Override
    public void levelCheck() {
        if (player.getScore()>99){
            player.setState(new SecondaryState(this));
        }
    }
}
