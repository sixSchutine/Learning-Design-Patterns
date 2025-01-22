package ObserverPattern;

public class Investor implements Observers{

    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name + "，你关注的股票价格有变动，点击查看详情...");
    }
}
