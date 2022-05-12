package module2_functional_interfaces.exercise2_bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class CalculatorBiFunction {
    public String calc(BiFunction<Integer,Integer,String> bi, Integer num1,Integer num2){
        return bi.apply(num1,num2);
    }
    public List<Double> calc(BiFunction<Double,Double,Double> bi,List<Employer> employerList, Double inc){
        List<Double> output = new ArrayList<>();
        for(Employer e: employerList){
            output.add(bi.apply(e.getSalary(),inc));
        }
        return output;
    }
}
