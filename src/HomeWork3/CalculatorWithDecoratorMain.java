package HomeWork3;

public class CalculatorWithDecoratorMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc1 = new CalculatorWithMathExtends();
        CalculatorWithMemoryDecorator calc2 = new CalculatorWithMemoryDecorator(calc1);
        CalculatorWithCounterDecorator calc3 = new CalculatorWithCounterDecorator(calc2);
        ICalculator calc = calc3;

        print(calc);
        System.out.println(calc2.outMemory());
    }

    public static void print(ICalculator calculator){
        // double a = 4.1 + 15 * 7 + ((28 / 5) * (28 / 5));
        System.out.println(calculator.addition
                (4.1, calculator.addition
                        (calculator.multiplication(15,7), calculator.power((28/5),2))));
        if (calculator instanceof CalculatorWithCounterDecorator){
            System.out.println(((CalculatorWithCounterDecorator) calculator).getCountOperation());
        }
    }
}
