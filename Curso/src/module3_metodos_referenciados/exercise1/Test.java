package module3_metodos_referenciados.exercise1;

import module3_metodos_referenciados.PersonComplete;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<PersonComplete> personCompleteList = Arrays.asList(
                new PersonComplete("Marcos",25,"a@a,es"),
                new PersonComplete("Edu",20,"a@a,es"),
                new PersonComplete("Mami",26,"a@a,es"),
                new PersonComplete("Papa",27,"a@a,es"),
                new PersonComplete("Javi",25,"a@a,es"),
                new PersonComplete("Marcos",18,"a@a,es")
        );
        Collections.sort(personCompleteList, (p1,p2) ->p1.getAge().compareTo(p2.getAge()));
        //Lo de arriba es igual a lo siguiente
        Collections.sort(personCompleteList, Comparator.comparing(PersonComplete::getAge));
        // Que es igual a esto
        Collections.sort(personCompleteList, (p1,p2) -> PersonComplete.compareAge(p1,p2));
        //METODO REFERENCIADO
        Collections.sort(personCompleteList, PersonComplete::compareAge);
        // TODAS SON IGUALES
        System.out.println(personCompleteList);
    }
}
