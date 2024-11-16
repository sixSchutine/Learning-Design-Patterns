package strategy;
//直减类，继承自Discount接口的具体策略类
public class decrease implements Discount{
    private final double LESS = 30;
    @Override
    public double calculate(double price) {
        System.out.println("直减" + LESS + "元!");
        return price - LESS;
    }
}
