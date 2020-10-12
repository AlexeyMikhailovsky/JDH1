package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double power(double a, double b) {
        return Math.pow(a,b);
    }

    @Override
    public double modul(double a) {
        return Math.abs(a);
    }

    @Override
    public double root(double number, double ruut) {
        return Math.pow(number,(1.0/ruut));
    }
}
