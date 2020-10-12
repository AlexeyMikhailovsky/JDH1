package HomeWork3;

public class CalculatorWithCounterInterface implements ICalculator{

    private ICalculator calc;

    private long operationCount = 0;

    private long getOperationCount() {
        return operationCount;
    }

    public long getCountOperation(){
        return getOperationCount();
    }

    public CalculatorWithCounterInterface( ){ this.calc = new CalculatorWithMathExtends(); }

    public CalculatorWithCounterInterface(ICalculator calc){ this.calc = calc; }

    public double power(double a, double b) {
        operationCount++;
        return this.calc.power(a, b);
    }

    public double modul(double a) {
        operationCount++;
        return this.calc.modul(a);
    }

    public double root(double number, double ruut) {
        operationCount++;
        return this.calc.root(number, ruut);
    }

    public double division(double a, double b){
        operationCount++;
        return this.calc.division(a, b);
    }

    public double multiplication(double a, double b){
        operationCount++;
        return this.calc.multiplication(a, b);
    }

    public double subtraction(double a, double b){
        operationCount++;
        return this.calc.subtraction(a, b);
    }

    public double addition(double a, double b){
        operationCount++;
        return this.calc.addition(a, b);
    }

    @Override
    public double outMemory() {
        return 0;
    }
}
