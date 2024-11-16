package Calculator;

public class DivideFactory implements CalculatorFactory{
    @Override
    public Calculator createCalculator() {
        System.out.println("计算a/b:");
        Calculator calculator = new Divide();
        return calculator;
    }
}
