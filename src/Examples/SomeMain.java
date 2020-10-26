package Examples;

import HomeWork3.CalculatorWithOperator;
import HomeWork3.ICalculator;

public class SomeMain {
    public  void main(String[] args) {
        DataCl<CalculatorWithOperator> calc = new DataCl<CalculatorWithOperator>();

        some(calc);
    }

    public void some(DataCl<? extends ICalculator> cl){
        System.out.println("fgfg");
    }
}
