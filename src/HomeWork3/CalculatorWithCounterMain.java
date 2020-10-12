package HomeWork3;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calc = new CalculatorWithCounter();
        double d = (calc.addition
                (4.1, calc.addition
                        (calc.multiplication(15,7), calc.power((28/5),2))));
        System.out.println(d);

        System.out.println(calc.getCountOperation());
    }

}
