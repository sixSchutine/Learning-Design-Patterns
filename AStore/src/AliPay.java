// 支付宝支付
class AliPay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("AliPay: " + amount);
    }
}
