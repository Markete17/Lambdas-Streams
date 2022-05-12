package module1_lambda_expressions.exercise2;

//Ejercicio 2 - Expresiones Lambda con parámetros
public class LambdaTest2 {
    public static void main(String[] args) {
        Operations op = (num1,num2) -> System.out.println(num1+num2);
        op.printOp(1,2); // output: 3
        LambdaTest2 lambdaTest2 = new LambdaTest2();
        lambdaTest2.method(op,3,5); // output: 8
        // Se puede especificar la implementación
        lambdaTest2.method((num1,num2) -> {System.out.println(num1/num2);},3,3);
    }
    public void method(Operations op, int num1, int num2){
        op.printOp(num1,num2);
    }

}
