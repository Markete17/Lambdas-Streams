package module6_operations.reduce;

import module6_operations.Human;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,2,2,1,5,3,6,78,34,342};
        List<Human> humanList = Arrays.asList(
                new Human(1L,"Juan",140.76,"M",32),
                new Human(2L,"Azucena",100.53,"W",82),
                new Human(3L,"Laura",600.49,"W",65),
                new Human(4L,"Marcos",11100.61,"M",43),
                new Human(5L,"Marina",10320.26,"",18),
                new Human(6L,"Guille",103210.21,"M",19),
                new Human(7L,"Antonia",10230.31,"W",22)
        );

        System.out.println("PROMEDIO "+
                IntStream.of(nums)
                        .average()
        );
        System.out.println("MAXIMO "+
                IntStream.of(nums)
                        .max().getAsInt()
        );
        System.out.println("MIN "+
                IntStream.of(nums)
                        .min().getAsInt()
        );

        System.out.println("SUMA SALARIOS "+
                humanList
                        .stream()
                        .mapToDouble(Human::getSalary)
                        .sum());
        System.out.println("EMPLEADO CON MAYOR SALARIO "+
                humanList
                        .stream()
                        .max(Comparator.comparing(Human::getSalary))
                        .get());

        // REDUCE
        System.out.println("SUMA ES: ");
        int sum = IntStream.of(nums)
                .reduce(0, Integer::sum);
        System.out.println(sum);

        Path path = Paths.get("src/module5_streams_create/text.txt");
        String text = "";
        try{
            Stream<String> stream = Files.lines(path);
            text = stream
                    .map(l -> l.replace(",",""))
                    .reduce((l1,l2) -> l1.concat("\n").concat(l2)).get();
            System.out.println(text);
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        //OPERACION RESUMEN RESULTADOS
        System.out.println();
        System.out.println("SUMMARY");
        System.out.println(
                IntStream.rangeClosed(1,20)
                        .summaryStatistics()
        );
        System.out.println(
                IntStream.rangeClosed(1,20)
                        .summaryStatistics()
                        //.getSum()
                        //.getMax()
                        //.getMin()
                        //.getCount()
                        .getAverage()
        );
    }
}
