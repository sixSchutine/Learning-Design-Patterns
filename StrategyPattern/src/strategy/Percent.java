package strategy;
//折扣类，继承自Discount接口的具体策略类
public class Percent implements Discount{
    private final double COUNT = 8;
    @Override
    public double calculate(double price) {
        System.out.println("优惠！" + COUNT + "折!");
        return price * COUNT / 10;
    }
}
