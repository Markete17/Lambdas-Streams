package module1_lambda_expressions.exercise5;

import module1_lambda_expressions.exercise4.CalculatorLong;

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
