package strategy;
//N元购类，继承自Discount接口的具体策略类
public class N_yuan implements Discount{
    private final double SET = 9.9;
    @Override
    public double calculate(double price) {
        System.out.println("全场" + SET + "元!");
        return SET;
    }
}
