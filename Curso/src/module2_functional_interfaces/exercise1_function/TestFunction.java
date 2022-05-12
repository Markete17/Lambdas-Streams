package module2_functional_interfaces.exercise1_function;

import java.util.function.Function;

// Ejercicio 1 - Interfaz funcional predeterminada: Function
public class TestFunction {
    public static void main(String[] args) {

        //<(Primer parametro),(Output)>
        Function<Integer,String> converter1 = x ->Integer.toString(x);
        System.out.println(converter1.apply(3).length());
        /* Sustituye a
        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        }*/

    }
}
