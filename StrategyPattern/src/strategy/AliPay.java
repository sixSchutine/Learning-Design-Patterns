package strategy;

public class AliPay implements Method{

    @Override
    public String getMethod() {
        return "支付宝付款";
    }
}
