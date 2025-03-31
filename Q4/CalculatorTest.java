public class CalculatorTest {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        
        int intResult = calc.add(5, 7);
        double doubleResult = calc.add(5.5, 7.5);
        
        System.out.println("Integer addition result: " + intResult);
        System.out.println("Double addition result: " + doubleResult);
    }
}