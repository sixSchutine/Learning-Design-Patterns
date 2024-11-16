package strategy;
//满减类，继承自Discount接口的具体策略类
public class Rebate implements Discount{
    private final double DIS = 20;
    private final double BASE = 100;
    @Override
    public double calculate(double price) {
        System.out.println("全场满" + BASE + "减" + DIS + "元!");
        if(price>BASE){
            return price - DIS;
        }
        else{
            return price;
        }
    }
}
