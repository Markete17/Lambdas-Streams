package module2_functional_interfaces.exercise3_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluator {
    public List<Employer> evaluate(List<Employer> employerList, Predicate<Employer> predicate){
        List<Employer> list = new ArrayList<>();
        for(Employer employer: employerList){
            if(predicate.test(employer)){
                list.add(employer);
            }
        }
        return list;
    }

    //TAMBIEN TIENE AND Y OR SE USA IGUAL UQE EL NEGATE
    public List<Employer> evaluateInverse(List<Employer> employerList, Predicate<Employer> predicate){
        List<Employer> list = new ArrayList<>();
        for(Employer employer: employerList){
            if(predicate.negate().test(employer)){
                list.add(employer);
            }
        }
        return list;
    }

}
