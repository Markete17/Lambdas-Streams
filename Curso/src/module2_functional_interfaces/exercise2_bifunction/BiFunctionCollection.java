package module2_functional_interfaces.exercise2_bifunction;

import java.util.Arrays;
import java.util.List;

public class BiFunctionCollection {
    public static void main(String[] args) {
        List<Employer> employerList = Arrays.asList(
                new Employer("Javi",200.32),
                new Employer("Marcos",2004.32),
                new Employer("Ruiz",2200.32),
                new Employer("Carlos",5200.35),
                new Employer("Marina",500.82)
        );
        CalculatorBiFunction calculatorBiFunction = new CalculatorBiFunction();
        List<Double> salaries = calculatorBiFunction.calc((salary,inc) -> salary + (salary * (inc/100)),employerList,16.0);
        System.out.println(salaries);
    }
}
