package module7_mutable_operations.collect;

import module6_operations.Human;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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

        //Proveedor que maneja Array lists
        Supplier<ArrayList<String>> supplier = ArrayList::new;
        BiConsumer<ArrayList<String>,String> acum = ArrayList::add;
        BiConsumer<ArrayList<String>,ArrayList> combinator = ArrayList::addAll;

        //COLLECT usa este proveedor en este metodo
        List<String> names = humanList
                        .stream()
                        .map(Human::getName)
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        System.out.println(names);

        //TAMBIEN SE PUEDE HACER ASI
        List<String> names2 = humanList
                .stream()
                .map(Human::getName).toList();
        System.out.println(names2);

        List<String> names3 = humanList
                .stream()
                .map(Human::getName)
                .collect(Collectors.toList());
        System.out.println(names3);

        Set<String> names4 = humanList
                .stream()
                .map(Human::getName)
                .collect(Collectors.toSet());
        System.out.println(names4);

        //ORDENAR EN ORDEN ALFABETICO CON TREE SET
        Set<String> names5 = humanList
                .stream()
                .map(Human::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(names5);
    }
}
