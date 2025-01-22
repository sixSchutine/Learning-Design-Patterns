// 微信支付
class WeChatPay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("WeChat Pay: " + amount);
    }
}
