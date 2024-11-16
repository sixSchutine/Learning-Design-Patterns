package Calculator;

public class AddFactory implements CalculatorFactory{
    @Override
    public Calculator createCalculator() {
        System.out.println("计算a+b:");
        Calculator calculator = new Add();
        return calculator;
    }
}
