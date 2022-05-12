package module2_functional_interfaces.exercise5__bipredicate;

import module2_functional_interfaces.exercise3_predicate.Employer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class TestBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> bp = (x,y) -> x<y;
        System.out.println(bp.test(2,3)); //true

        List<Employer> employerList = Arrays.asList(
                new Employer("Javi",200.32,32,"Cobros"),
                new Employer("Luna",2002.32,32,"Cobros"),
                new Employer("Pepe",213200.32,62,"Ventas"),
                new Employer("Juan",75203213210.32,32,"Mostrador"),
                new Employer("Rodrasdi",700.32,43,"Ventas"),
                new Employer("Javi2",67213213200.32,12,"Marketing"),
                new Employer("Luana",75627600.32,21,"Marketing"),
                new Employer("Rodri",700.32,18,"Ventas"),
                new Employer("Juan",75203213210.32,24,"Mostrador"),
                new Employer("Raai",700.32,32,"Ventas"),
                new Employer("Ja",75203213210.32,32,"Mostrador"),
                new Employer("Manga",700.32,45,"Ventas"));

                // Obtener empleados que cumplan alguno de estos dos conjutos de criterios:
                // 1. 25 años en adelante y que estén en departamento de Ventas
                // 2. 25 años en adelante y que estén en mostrador

                EvaluatorBiPredicate e = new EvaluatorBiPredicate();
                BiPredicate<Integer,String> primerCriterio = (age,department) -> (age>=25) && (department.equals("Ventas"));
                BiPredicate<Integer,String> segundoCriterio = (age,department) -> (age>=25) && (department.equals("Mostrador"));
                BiPredicate<Integer,String> criterio = primerCriterio.or(segundoCriterio);
                List<Employer> output = e.evaluate(employerList,criterio);
                for(Employer employer:output){
                    System.out.println("NAME: "+employer.getName());
                }

    }
}
