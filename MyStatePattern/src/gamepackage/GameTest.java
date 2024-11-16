package gamepackage;

public class GameTest {
    public static void main(String[] args) {
        Player player = new Player();

        // 初始状态是入门级
        System.out.println(player.score);
        player.play();
        player.doubleScore();
        player.changeCards();
        player.peekCards();
        for (int i=0;i<5;i++){
            player.win(player.score);
        }
        player.levelCheck();

        // 升级到熟练级
        System.out.println(player.score);
        player.play();
        player.doubleScore();
        player.changeCards();
        player.peekCards();
        for (int i=0;i<5;i++){
            player.win(player.score);
        }
        player.levelCheck();

        // 升级到高手级
        System.out.println(player.score);
        player.play();
        player.doubleScore();
        player.changeCards();
        player.peekCards();
        for (int i=0;i<3;i++){
            player.win(player.score);
        }
        player.levelCheck();

        // 升级到骨灰级
        System.out.println(player.score);
        player.play();
        player.doubleScore();
        player.changeCards();
        player.peekCards();
        for (int i=0;i<3;i++){
            player.lose(player.score);
        }

        player.levelCheck();
        player.play();
        System.out.println(player.score);
    }
}
