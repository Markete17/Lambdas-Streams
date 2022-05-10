package Module1_LambdaExpressions.exercise5;

import Module1_LambdaExpressions.exercise4.CalculatorLong;

// en este ejercicio, se explica como crear una interfaz funcional a través de un método
public class LambdaTest5 {

    public static void main(String[] args) {
        System.out.println(create().calculate(2,2));
    }

    private static CalculatorLong create(){
        long v = 200l;
        return (x,y) -> x/y + v;
    }
}
