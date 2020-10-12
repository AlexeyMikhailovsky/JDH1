package HomeWork3;

public class CalculatorWithMemory implements ICalculator {

    private ICalculator calc;

    private double memory = 0;

    private double lastOperationResult = 0;

    private double getMemory() {
        return memory;
    }

    private void setMemory(double memory) {
        this.memory = memory;
    }

    private void writeMemory(){
        setMemory(lastOperationResult);
    }

    public double outMemory(){
        lastOperationResult = getMemory();
        setMemory(0);
        return lastOperationResult;
    }

    public CalculatorWithMemory( ){ this.calc = new CalculatorWithMathExtends(); }

    public CalculatorWithMemory(ICalculator calc){ this.calc = calc; }

    public double power(double a, double b) {
        lastOperationResult = this.calc.power(a, b);
        writeMemory();
        return lastOperationResult ;
    }

    public double modul(double a) {
        lastOperationResult = this.calc.modul(a);
        writeMemory();
        return lastOperationResult;
    }

    public double root(double a, double b) {
        lastOperationResult = this.calc.root(a, b);
        writeMemory();
        return lastOperationResult ;
    }

    public double division(double a, double b){
        lastOperationResult = this.calc.division(a, b);
        writeMemory();
        return lastOperationResult ;
    }

    public double multiplication(double a, double b){
        lastOperationResult = this.calc.multiplication(a, b);
        writeMemory();
        return this.calc.multiplication(a, b) ;
    }

    public double subtraction(double a, double b){
        lastOperationResult = this.calc.subtraction(a, b);
        writeMemory();
        return lastOperationResult ;
    }

    public double addition(double a, double b){
        lastOperationResult = this.calc.addition(a, b);
        writeMemory();
        return lastOperationResult ;
    }

    @Override
    public long getCountOperation() {
        return this.calc.getCountOperation();
    }
}
