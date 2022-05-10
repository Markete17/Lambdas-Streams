package Module1_LambdaExpressions.exercise3;

//Ejercicio 3 - Expresiones Lambda con devolucion
public class LambdaTest3 {

    public static void main(String[] args) {
        engine((x,y) -> x+y);
        engine((x,y) -> x-y);
        engine((x,y) -> x/y);
        engine((x,y) -> x*y);
        engine((x,y) -> x%y);
    }

    public static void engine(Calculator calculator){
        int x = 2;
        int y = 4;
        int result = calculator.calculate(x,y);
        System.out.println(result);
    }
}
