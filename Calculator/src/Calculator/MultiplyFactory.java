package Calculator;

public class MultiplyFactory implements CalculatorFactory{
    @Override
    public Calculator createCalculator() {
        System.out.println("计算a*b:");
        Calculator calculator = new Multiply();
        return calculator;
    }
}
