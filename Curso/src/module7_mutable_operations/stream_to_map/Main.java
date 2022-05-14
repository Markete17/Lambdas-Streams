package module7_mutable_operations.stream_to_map;

import module6_operations.Human;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humanList = Arrays.asList(
                new Human(1L,"Juan",140.76,"M",32),
                new Human(2L,"Azucena",100.53,"W",82),
                new Human(3L,"Laura",600.49,"W",65),
                new Human(4L,"Marcos",11100.61,"M",43),
                new Human(5L,"Marina",10320.26,"W",18),
                new Human(6L,"Guille",103210.21,"M",19),
                new Human(7L,"Antonia",10230.31,"W",22)
        );
        Map<Long,String> longStringMap =
                humanList
                        .stream()
                        .collect(Collectors.toMap(
                                Human::getId,Human::getName
                        ));
        System.out.println(longStringMap);

        Map<String,String> genreNameMap =
                humanList
                        .stream()
                        .collect(Collectors.toMap(
                                Human::getGenre,
                                Human::getName,
                                (name1,name2) -> String.join(",",name1,name2)
                        ));
        System.out.println(genreNameMap);
    }
}
