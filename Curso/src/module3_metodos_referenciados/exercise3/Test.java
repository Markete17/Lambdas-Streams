package module3_metodos_referenciados.exercise3;

import module3_metodos_referenciados.PersonComplete;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    //METODOS DE INSTANCIA DE UN TIPO ARBITRARIO
    public static void main(String[] args) {
        List<PersonComplete> personCompleteList = Arrays.asList(
                new PersonComplete("Marcos",25,"a@a,es"),
                new PersonComplete("Edu",20,"a@a,es"),
                new PersonComplete("Mami",26,"a@a,es"),
                new PersonComplete("Papa",27,"a@a,es"),
                new PersonComplete("Javi",25,"a@a,es"),
                new PersonComplete("Marcos",18,"a@a,es")
        );
        Collections.sort(personCompleteList, PersonComplete::compareAge2);
        //Equivale a (per1,per2) -> per1.compareAge2(per2)
    }
}
