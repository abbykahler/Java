public class CalculatorTest {
    public static void main(String[] args){
        Calculator one = new Calculator();
        one.setOperation("-");
        System.out.println(one.getOperation());
        one.setOperation1(3);
        one.setOperation2(1);
        one.calculate();
        System.out.println(one.getResult());
    }
}