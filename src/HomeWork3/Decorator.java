package HomeWork3;

abstract class Decorator implements ICalculator {
    protected ICalculator calc;

    public Decorator(ICalculator calc){
        this.calc = calc;
    }
}
