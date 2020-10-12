package HomeWork3;

public class CalculatorWithMathCopy implements ICalculator{

    public double division(double a, double b){ return (a / b); }

    public double multiplication(double a, double b){ return (a * b);}

    public double subtraction(double a, double b){ return (a - b);}

    public double addition(double a, double b){ return (a + b);}

    public double power(double a, double b){ return Math.pow(a,b); }

    public double modul(double a){ return Math.abs(a); }

    public double root(double a, double b){ return Math.pow(a,(1.0/b)); }

    @Override
    public double outMemory() {
        return 0;
    }

    @Override
    public long getCountOperation() {
        return 0;
    }
}
