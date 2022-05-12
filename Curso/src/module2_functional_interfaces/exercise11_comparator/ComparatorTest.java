package module2_functional_interfaces.exercise11_comparator;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person(1L,"Mario",null),
                new Person(2L,"Javier",null),
                new Person(3L,"Alba",null),
                new Person(4L,"Zorman",null)

        );
        Collections.sort(personList);
        System.out.println("METODO ANTIGUO");
        personList.forEach((p) -> System.out.println(p.getName()));

        // En vez de hacer esto, se puede pasar como parametro el Comparator
        // en el Collections.sort
        System.out.println("METODO VIEJO");
        Collections.sort(personList,new OrderPersonById());
        personList.forEach((p) -> System.out.println(p.getName()+" with ID: "+p.getId()));
        //tambien se puede poner explicito
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getId()-o2.getId());
            }
        });
        personList.forEach((p) -> System.out.println(p.getName()+" with ID: "+p.getId()));

        System.out.println("METODO NUEVO!!");
        Collections.sort(personList, (p1,p2) -> (int) (p1.getId()-p2.getId()));
        personList.forEach((p) -> System.out.println(p.getName()+" with ID: "+p.getId()));
    }
}
