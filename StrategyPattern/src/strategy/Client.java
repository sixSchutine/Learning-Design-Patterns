package strategy;

//客户端
public class Client {
    public static void main(String[] args){
        Payment pm = new Payment();
        double originalPrice = 299.0;
        double currentPrice;

        pm.setPrice(originalPrice);
        System.out.println("原价："+originalPrice+"元");

        Discount discount;
        discount = XMLUtil.getDiscount(); //用反射机制和XML文件创造新实例
        //discount = new Percent(); //用new关键字创造新实例

        pm.setDiscount(discount);

        currentPrice = pm.getPrice();
        System.out.println("折后价："+currentPrice+"元");

        Method method;
        method = XMLUtil.getMethod(); //用反射机制和XML文件创造新实例
        //method = new Bank(); //用new关键字创造新实例
        pm.setMethod(method);

        System.out.println("支付方式："+pm.getMethod());
    }
}
