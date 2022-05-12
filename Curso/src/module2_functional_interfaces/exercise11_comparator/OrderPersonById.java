package module2_functional_interfaces.exercise11_comparator;

import java.util.Comparator;

//CON EL METODO NUEVO NO SE CREARIA ESTA CLASE
public class OrderPersonById implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (int) (o1.getId() - o2.getId());
    }
}
