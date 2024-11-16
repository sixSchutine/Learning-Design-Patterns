package strategy;
//付款类，充当环境类
public class Payment {
    private double price;
    private Method method; //对付款方法类对象的引用
    private Discount discount; //对优惠类的引用

    public void setPrice(double price) {
        this.price = price;
    }

    //注入一个优惠类对象
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }


    //调用优惠价的计算方法
    public double getPrice() {
        return discount.calculate(this.price);
    }

    //注入一个付款方法类对象
    public void setMethod(Method method) {
        this.method = method;
    }

    //调用付款方法的显示
    public String getMethod() {
        return method.getMethod();
    }
}
