package HomeWork3;

public class CalculatorWithDecoratorMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc1 = new CalculatorWithMathExtends();
        CalculatorWithMemoryDecorator calc2 = new CalculatorWithMemoryDecorator(calc1);
        CalculatorWithCounterDecorator calc3 = new CalculatorWithCounterDecorator(calc2);
        ICalculator calc4 = calc3;


        // double a = 4.1 + 15 * 7 + ((28 / 5) * (28 / 5));
        System.out.println(calc4.addition
                (4.1, calc4.addition
                        (calc4.multiplication(15,7), calc4.power((28/5),2))));

        System.out.println(calc4.outMemory());
        System.out.println(calc4.getCountOperation());
    }
}
