package module2_functional_interfaces.exercise3_predicate;

import java.util.function.Predicate;

public class TestPredicate1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (v) -> v>0;

        System.out.println(predicate.test(123)); // true
    }
}
