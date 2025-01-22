package ObserverPattern;

import java.util.ArrayList;

public abstract class Observable {
    protected ArrayList <Observers> allObservers = new ArrayList<>();
    public void attach(Observers observers){
        allObservers.add(observers);
    }
    public void detach(Observers observers){
        allObservers.remove(observers);
    }
    public abstract void notice();
}
