// 上下文类
class OrderContext {
    private PaymentStrategy paymentStrategy;

    public OrderContext(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void payOrder(double amount) {
        paymentStrategy.pay(amount);
    }
}
