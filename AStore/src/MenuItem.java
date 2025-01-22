// 被观察者类
import java.util.ArrayList;
import java.util.List;

class MenuItem {
    private String name;
    private double price;
    private int quantity;

    private List<OrderObserver> observers = new ArrayList<>();
    public MenuItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void order() {
        if (quantity > 0) {
            quantity--;
            notifyObservers();
        } else {
            System.out.println(name + " is out of stock.");
        }
    }
}
