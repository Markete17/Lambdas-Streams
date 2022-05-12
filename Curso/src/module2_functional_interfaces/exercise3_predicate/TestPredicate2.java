package module2_functional_interfaces.exercise3_predicate;

import java.util.Arrays;
import java.util.List;

public class TestPredicate2 {
    public static void main(String[] args) {
        List<Employer> employerList = Arrays.asList(
                new Employer("Javi",200.32,32,"Cobros"),
                new Employer("Luna",2002.32,32,"Cobros"),
                new Employer("Pepe",213200.32,62,"Ventas"),
                new Employer("Juan",75203213210.32,32,"Mostrador"),
                new Employer("Javi2",67213213200.32,12,"Marketing"),
                new Employer("Luana",75627600.32,2,"Marketing"),
                new Employer("Rodri",700.32,32,"Ventas")
        );
        System.out.println("---Salary > 5000.50---");
        Evaluator evaluator = new Evaluator();
        List<Employer> list = evaluator.evaluate(employerList,(employer -> employer.getSalary()>5000.50));
        for(Employer e: list){
            System.out.println(e.getName());
        }
        System.out.println("---Start with J---");
        list = evaluator.evaluate(employerList,(employer -> employer.getName().startsWith("J")));
        for(Employer e: list){
            System.out.println(e.getName());
        }
        System.out.println("---age < 25 ---");
        list = evaluator.evaluate(employerList,(employer -> employer.getAge()<25));
        for(Employer e: list){
            System.out.println(e.getName());
        }
    }
}
