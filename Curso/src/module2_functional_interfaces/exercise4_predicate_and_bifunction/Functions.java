package module2_functional_interfaces.exercise4_predicate_and_bifunction;

import module2_functional_interfaces.exercise3_predicate.Employer;

import java.util.function.BiFunction;

public class Functions {
    public double incrementSalary(Employer e, double inc, BiFunction<Double, Double, Double> bi){
        return bi.apply(e.getSalary(),inc);
    }
}
