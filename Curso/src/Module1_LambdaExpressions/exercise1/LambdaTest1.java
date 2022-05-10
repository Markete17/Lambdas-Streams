package Module1_LambdaExpressions.exercise1;

//Ejercicio 1 - Expresiones Lambda sin parámetros
public class LambdaTest1 {
    public static void main(String[] args) {

        Greetings gt = () -> System.out.println("Hello World");
        //Ya tiene implementada la interfaz -> output Hello World
        gt.greetings();

        //Hace lo mismo pero con un método
        LambdaTest1 main = new LambdaTest1();
        main.myMethod(gt);
    }
    //Ejercicio 1 - Expresiones Lambda
    public void myMethod(Greetings param){
        param.greetings();
    }
}
