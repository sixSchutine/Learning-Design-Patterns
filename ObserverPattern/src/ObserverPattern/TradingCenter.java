package ObserverPattern;

public class TradingCenter extends Observable {

    @Override
    public void notice() {
        System.out.println("今日New_Fashion股票价格上涨0.25%");
        for(Observers i:allObservers){
            i.update();
        }
    }
}
