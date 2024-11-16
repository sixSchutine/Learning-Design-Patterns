package Calculator;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        CalculatorFactory calculatorFactory;
        Calculator calculator;
        calculatorFactory = XMLUtil.getCalculator();
        calculator = calculatorFactory.createCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a：");
        String s1 = scanner.nextLine(); // 读取输入的字符串
        double a = Double.parseDouble(s1); // 将字符串转换为double
        System.out.println("请输入b：");
        String s2 = scanner.nextLine();
        double b = Double.parseDouble(s2);
        System.out.println(calculator.figureOut(a,b));
    }
}
