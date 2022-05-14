package module6_operations.filter;

import module6_operations.Human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = Arrays.asList(
                new Human(1L,"Juan",140.76,"M",32),
                new Human(2L,"Azucena",100.53,"W",82),
                new Human(3L,"Laura",600.49,"W",65),
                new Human(4L,"Marcos",11100.61,"M",43),
                new Human(5L,"Marina",10320.26,"",18),
                new Human(6L,"Guille",103210.21,"M",19),
                new Human(7L,"Antonia",10230.31,"W",22)
        );
        System.out.println("MENS");
        humanList
                .stream()
                .filter(Human::isMen)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("WOMANS >25 ages");

        humanList
                .stream()
                .filter(e -> e.isWoman() && e.getAge()>25)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("MANS start with 'm'");
        humanList
                .stream()
                .filter(e -> e.getName().startsWith("M") && e.isMen())
                .forEach(System.out::println);
        Predicate<Human> predicate1 = e -> e.isWoman();
        Predicate<Human> predicate2 = e -> e.getAge()>25;
        Predicate<Human> predicate3 = e -> e.getSalary()>2000;
        Predicate<Human> predicate = predicate1.and(predicate2).and(predicate3);

        System.out.println();
        System.out.println("OTRA MANERA");
        humanList
                .stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}

