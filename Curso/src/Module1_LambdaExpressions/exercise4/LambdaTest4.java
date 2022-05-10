package Module1_LambdaExpressions.exercise4;

import Module1_LambdaExpressions.exercise3.Calculator;

//Ejercicio 4 - Expresiones Lambda ambigüedades
public class LambdaTest4 {

    public static void main(String[] args) {
        // Solución1: en estos casos si que se tienen que especificar los tipos de datos
        engine((long x,long y) -> x+y);
        engine((int x,int y) -> x/y);
        // Solución2: tambien se puede hacer con un cast
        engine((CalculatorInt) (x,y) -> x-y);
        engine((CalculatorLong)(x,y) -> x*y);

        // Solución3: tambien de esta forma
        CalculatorInt calculatorInt = (x,y) -> x*y;
        engine(calculatorInt);
    }

    public static void engine(CalculatorInt calculator){
        int x = 2;
        int y = 4;
        int result = calculator.calculate(x,y);
        System.out.println(result);
    }
    public static void engine(CalculatorLong calculator){
        long x = 2;
        long y = 4;
        long result = calculator.calculate(x,y);
        System.out.println(result);
    }
}
