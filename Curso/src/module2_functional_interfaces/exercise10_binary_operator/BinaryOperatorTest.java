package module2_functional_interfaces.exercise10_binary_operator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (num1,num2) -> num1*num2;

        //Aplicando en método apply
        int r=binaryOperator.apply(2,3);
        System.out.println(r);

        //Uso del minBy
        BinaryOperator<Integer> binaryOperatorMin = BinaryOperator.minBy(Comparator.naturalOrder());
        r = binaryOperatorMin.apply(10,20);
        System.out.println("El menor es :"+r);

        //Uso del maxBy
        BinaryOperator<Integer> binaryOperatorMax = BinaryOperator.maxBy(Comparator.reverseOrder());
        r = binaryOperatorMax.apply(10,20);
        System.out.println("El menor es :"+r);
    }
}
