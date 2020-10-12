package HomeWork3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        // double a = 4.1 + 15 * 7 + ((28 / 5) * (28 / 5));
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double d = (calc.addition
                (4.1, calc.addition
                        (calc.multiplication(15,7), calc.power((28/5),2))));
        System.out.println(d);
    }
}
