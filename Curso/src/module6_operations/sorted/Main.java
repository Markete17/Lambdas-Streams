package module6_operations.sorted;

import module6_operations.Human;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Arrays.asList("Alfredo","Juan","Daniel","Brenda")
                .stream()
                .sorted()
                .forEach(System.out::println);

        Arrays.asList(3,42,2,6,8,1,0,34,21)
                .stream()
                .sorted()
                .forEach(System.out::println);

        List<Human> humanList = Arrays.asList(
                new Human(1L,"Juan",140.76,"M",32),
                new Human(2L,"Azucena",100.53,"W",82),
                new Human(3L,"Laura",600.49,"W",65),
                new Human(4L,"Marcos",11100.61,"M",43),
                new Human(5L,"Marina",10320.26,"W",18),
                new Human(6L,"Guille",103210.21,"M",19),
                new Human(7L,"Antonia",10230.31,"W",22)
        );
        humanList
                .stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        humanList
                .stream()
                //.sorted( (c1,c2) -> c1.getAge().compareTo(c2.getAge()))
                .sorted(Comparator.comparing(Human::getAge))
                .forEach(System.out::println);

        System.out.println();

        humanList
                .stream()
                //.sorted( (c1,c2) -> c1.getAge().compareTo(c2.getAge()))
                .sorted((c1,c2) -> c2.getAge().compareTo(c1.getAge()))
                .forEach(System.out::println);
    }
}
