package HomeWork3;

public class CalculatorWithOperator implements ICalculator{

    public double division(double a, double b){ return (a / b); }

    public double multiplication(double a, double b){ return (a * b);}

    public double subtraction(double a, double b){ return (a - b);}

    public double addition(double a, double b){ return (a + b);}

    public double power(double a, double b){
        double p = 1;
        for (int i = 1; i <= b; i++) {
            p = p * a;
        }
        return p;
    }

    public double modul(double a){ return (a <= 0.0) ? 0.0 - a : a; }

    public double root(double number, double ruut) {
        double rt = number / ruut;
        double rn = number;

        while(mabs(rt - rn) >= 0.00001){
            rn = number;
            for (int i = 1; i < ruut; i++) {
                rn = rn / rt;
            }
            rt = 0.5 * (rn + rt);
        }

        return rt;
    }

    private double mabs(double x){ return (x < 0)? -x : x; }

}
