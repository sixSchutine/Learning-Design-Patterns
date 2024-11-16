package strategy;
//优惠类，充当抽象策略类
public interface Discount {
    public double calculate(double price);
}
