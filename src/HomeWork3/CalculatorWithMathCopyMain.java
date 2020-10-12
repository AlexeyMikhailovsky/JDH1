package HomeWork3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        double d = (calc.addition
                (4.1, calc.addition
                        (calc.multiplication(15,7), calc.power((28/5),2))));
        System.out.println(d);
    }

}
