package module3_metodos_referenciados.exercise2;

import module3_metodos_referenciados.PersonComplete;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        ProveedorComparation comparation = new ProveedorComparation();
        Collections.sort(personCompleteList, comparation::compareName);
        personCompleteList.forEach((p) -> System.out.println(p.getAge() + "-" + p.getName()));
        Collections.sort(personCompleteList, comparation::compareAge);
        personCompleteList.forEach((p) -> System.out.println(p.getAge() + "-" + p.getName()));
    }
}
