package HomeWork3;

public class CalculatorWithCounterDecorator extends Decorator{

    private long operationCount = 0;

    private long getOperationCount() {
        return operationCount;
    }

    @Override
    public long getCountOperation(){
        return getOperationCount();
    }

    public CalculatorWithCounterDecorator(ICalculator calc){
        super(calc);
    }

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
        return calc.outMemory();
    }

    public ICalculator getCalculator(){
        return this.calc;
    }
}
