package module3_metodos_referenciados.exercise2;

import module3_metodos_referenciados.PersonComplete;

public class ProveedorComparation {
    public int compareName(PersonComplete p1, PersonComplete p2){
        return p1.getName().compareTo(p2.getName());
    }
    public int compareAge(PersonComplete p1, PersonComplete p2){
        return p1.getAge().compareTo(p2.getAge());
    }

}
