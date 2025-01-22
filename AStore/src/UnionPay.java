// 银联支付
class UnionPay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("UnionPay: " + amount);
    }
}
