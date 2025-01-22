public class Main {
    public static void main(String[] args) {
        // 创建菜单
        MenuItemFactory factory = new MenuItemFactory();
        MenuItem danDanMian = factory.createMenuItem("担担面");
        MenuItem douHuaYu = factory.createMenuItem("豆花鱼");
        MenuItem laiTangYuan = factory.createMenuItem("赖汤圆");
        // 创建观察者
        OrderObserver observer = new OrderObserver();
        danDanMian.addObserver(observer);
        douHuaYu.addObserver(observer);
        laiTangYuan.addObserver(observer);
        // 选择支付方式（策略模式）
        PaymentStrategy paymentStrategy = new WeChatPay(); // 可以换成Alipay或UnionPay
        OrderContext orderContext = new OrderContext(paymentStrategy);
        // 模拟用户点餐
        System.out.println("Menu:");
        System.out.println(danDanMian.getName() + " - ￥" + danDanMian.getPrice() + " (" + danDanMian.getQuantity() + " left)");
        System.out.println(douHuaYu.getName() + " - ￥" + douHuaYu.getPrice() + " (" + douHuaYu.getQuantity() + " left)");
        System.out.println(laiTangYuan.getName() + " - ￥" + laiTangYuan.getPrice() + " (" + laiTangYuan.getQuantity() + " left)");
        // 点餐
        danDanMian.order();
        douHuaYu.order();
        // 支付
        double totalAmount = danDanMian.getPrice() + douHuaYu.getPrice();
        orderContext.payOrder(totalAmount);
    }
}
