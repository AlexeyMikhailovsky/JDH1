package HomeWork3;

public class CalculatorWithCounter implements ICalculator{

    private CalculatorWithOperator calcWithOp;
    private CalculatorWithMathCopy calcWithMath;
    private CalculatorWithMathExtends calcWithMathEx;

    private long operationCount = 0;

    private long getOperationCount() {
        return operationCount;
    }

    public long getCountOperation(){
        return getOperationCount();
    }

    public CalculatorWithCounter(){
        this.calcWithMathEx = new CalculatorWithMathExtends();
    }

    public CalculatorWithCounter(CalculatorWithOperator calc){
        this.calcWithOp = calc;

    }

    public CalculatorWithCounter(CalculatorWithMathCopy calc){
        this.calcWithMath = calc;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calc){
        this.calcWithMathEx = calc;
    }

    public double power(double a, double b) {
        operationCount++;
        return this.calcWithMathEx.power(a,b);
    }

    public double modul(double a) {
        operationCount++;
        return this.calcWithMathEx.modul(a);
    }

    public double root(double number, double ruut) {
        operationCount++;
        return this.calcWithMathEx.root(number,ruut);
    }

    public double division(double a, double b){
        operationCount++;
        return this.calcWithMathEx.division(a,b);
    }

    public double multiplication(double a, double b){
        operationCount++;
        return this.calcWithMathEx.multiplication(a, b);
    }

    public double subtraction(double a, double b){
        operationCount++;
        return this.calcWithMathEx.subtraction(a, b);
    }

    public double addition(double a, double b){
        operationCount++;
        return this.calcWithMathEx.addition(a, b);
    }

    @Override
    public double outMemory() {
        return 0;
    }
}
