package module6_operations.map;

import module6_operations.Human;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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

        IntStream.rangeClosed(1,5)
                        .map(e -> e*e)
                                .forEach(System.out::println);
        System.out.println();
        IntStream.rangeClosed(1,10)
                .map(n -> n*2)
                .forEach(System.out::println);

        System.out.println("PROMEDIO INGRESOS PERSONAL FEMENINO MAYOR 25");
        double sum = humanList
                .stream()
                .filter(e -> e.isWoman() && e.getAge()>25)
                .mapToDouble(Human::getSalary)
                .sum();
        System.out.println("PROMEDIO: "+sum / humanList
                .stream()
                .filter(e -> e.isWoman() && e.getAge()>25).count());
    }
}
