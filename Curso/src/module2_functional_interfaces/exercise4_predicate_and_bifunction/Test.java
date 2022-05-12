package module2_functional_interfaces.exercise4_predicate_and_bifunction;

import module2_functional_interfaces.exercise3_predicate.Employer;
import module2_functional_interfaces.exercise3_predicate.Evaluator;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employer> employerList = Arrays.asList(
                new Employer("Javi",200.32,32,"Cobros"),
                new Employer("Luna",2002.32,32,"Cobros"),
                new Employer("Pepe",213200.32,62,"Ventas"),
                new Employer("Juan",75203213210.32,32,"Mostrador"),
                new Employer("Javi2",67213213200.32,12,"Marketing"),
                new Employer("Luana",75627600.32,21,"Marketing"),
                new Employer("Rodri",700.32,18,"Ventas")
        );
        Evaluator evaluator = new Evaluator(); // PREDICATE
        Functions functions = new Functions(); // BiFunction
        List<Employer> employerListMenores = evaluator.evaluate(employerList,(employer -> employer.getAge()<25));
        List<Employer> employerListMayores = evaluator.evaluateInverse(employerList,(employer -> employer.getAge()<25));
        for(Employer e: employerListMenores){
            double newSalary = functions.incrementSalary(e,10, (salary,inc) -> salary + (salary*(inc/100)));
            e.setSalary(newSalary);
        }
        System.out.println("MENORES");
        for (Employer e:employerListMenores){
            System.out.println("Name: "+e.getName()+" Salary: "+e.getSalary());
        }
        for(Employer e: employerListMayores){
            double newSalary = functions.incrementSalary(e,10, (salary,inc) -> salary + (salary*(inc/100)));
            e.setSalary(newSalary);
        }
        System.out.println("MAYORES");
        for (Employer e:employerListMayores){
            System.out.println("Name: "+e.getName()+" Salary: "+e.getSalary());
        }
    }
}
