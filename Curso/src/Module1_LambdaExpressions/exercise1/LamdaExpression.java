package Module1_LambdaExpressions.exercise1;

//Teoria
public class LamdaExpression {

    //1 sentence
    Dummy dummy = (value1, value2) -> System.out.println("Hello Marcos "+value1+value2);
    //2 senteces
    Dummy dummy2 = (value1,value2) -> {
        System.out.println("Hello Marcos " + value1 + value2);
        System.out.println("Hello Marcos " + value1 + value2);
    };

    /* Lambda expression replaces:
    interfaces.exercise1.Dummy d = new interfaces.exercise1.Dummy() {
        @Override
        public void accept(int value1, int value2) {
            System.out.println("Hello Marcos "+value1+value2);
        }
    }
     * */

    //Java 8 sabe que el v es int
    Function f = (v,str) ->System.out.println(v+str);

    // Ejemplo que pasa una interfaz funcional en un método
    public void example(){
        LamdaExpression lamdaExpression = new LamdaExpression();
        lamdaExpression.method((v,str) -> System.out.println("hello"+v+str));
    }
    public void method(Function param){
        //TODO
    }
}
