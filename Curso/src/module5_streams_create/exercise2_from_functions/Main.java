package module5_streams_create.exercise2_from_functions;

import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Long> primerosDiez = Stream.iterate(
                1L,n -> n+1).limit(10);
        primerosDiez.forEach(System.out::println);
        System.out.println();

        Stream.iterate(1L,n -> n+1)
                .filter(n -> n%2 ==0)
                .limit(20)
                .forEach(System.out::println);
        System.out.println();

        Stream.iterate(1L, n->n+1)
                .filter(n -> n%2 ==0)
                .skip(100) //Saltar los 100 primeros
                .limit(5) //Limitar a que se rellenen solo 5
                .forEach(System.out::println);
        System.out.println();

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);
        System.out.println();

        // new Random tiene metodos que genera streams
        new Random()
                .ints()
                .limit(5)
                .forEach(System.out::println);
    }
}
