package module2_functional_interfaces.exercise9_unary_operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

// Misma utilidad que Function pero atributos del mismo tipo
public class UnaryOperatorTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
        List<Integer> output = unaryOperator((num) -> num*num,list);
        output.forEach((x) -> System.out.println(x));
    }

    public static List<Integer> unaryOperator(UnaryOperator<Integer> unaryOperator, List<Integer> list){
        List<Integer> updatedList = new ArrayList<>();
        list.forEach((num) -> updatedList.add(unaryOperator.apply(num)));
        return updatedList;
    }
}

