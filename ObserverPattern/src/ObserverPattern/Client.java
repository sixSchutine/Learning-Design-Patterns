package ObserverPattern;

public class Client {
    public static void main(String[] args) {
        Observers i1,i2,i3;
        i1 = new Investor("A");
        i2 = new Investor("B");
        i3 = new Investor("C");

        TradingCenter tc = new TradingCenter();
        tc.attach(i1);
        tc.attach(i2);
        tc.attach(i3);

        tc.notice();
    }
}
