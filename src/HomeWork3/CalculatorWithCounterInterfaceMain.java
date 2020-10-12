package HomeWork3;

public class CalculatorWithCounterInterfaceMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterInterface() {
        };
        double d = (calc.addition
                (4.1, calc.addition
                        (calc.multiplication(15,7), calc.power((28/5),2))));
        System.out.println(d);

    }
}
