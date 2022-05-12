package module2_functional_interfaces.exercise2_bifunction;

import java.util.function.BiFunction;

//Ejercicio 1 - Interfaz funcional predeterminada: BiFunction
public class BiFunctionTest {
    public static void main(String[] args) {
        //<param1,param2,output>
        BiFunction<String,String,String> bi = (x, y) -> x+y;
        System.out.println(bi.apply("hola ","mundo"));

        CalculatorBiFunction calculatorBiFunction = new CalculatorBiFunction();
        String out = calculatorBiFunction.calc(
                (x,y) -> "Result : "+(x*y),60,10
        );
        System.out.println(out);
    }
}
