package module2_functional_interfaces.exercise5__bipredicate;

import module2_functional_interfaces.exercise3_predicate.Employer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class EvaluatorBiPredicate {
    public List<Employer> evaluate(List<Employer> employerList, BiPredicate<Integer,String> biPredicate){
        List<Employer> output = new ArrayList<>();
        for(Employer e:employerList){
            if(biPredicate.test(e.getAge(),e.getDepartment())){
                output.add(e);
            }
        }
        return output;
    }
}
