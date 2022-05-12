package module5_streams_create.exercise1_from_values;

import module5_streams_create.StudentBasic;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 =
                Stream.of("New Stream");
        stream1.forEach(System.out::println);
        System.out.println();

        Stream<String> stream2 =
                Stream.of("c1","c2","c3","c4");
        stream2.forEach(System.out::println);
        System.out.println();

        String [] array = {"java","c++","c#","ruby"};
        Stream<String> stream3 =
                Stream.of(array);
        stream3.forEach(System.out::println);
        System.out.println();

        Stream<StudentBasic> steam4 = Stream.<StudentBasic>builder().add(
                new StudentBasic("ID_1",20,1.60,1.4)).add(
                new StudentBasic("ID_2",30,1.70,1.4)).add(
                new StudentBasic("ID_3",40,1.80,1.4)).add(
                new StudentBasic("ID_4",50,1.90,1.4)).build();
        steam4.forEach(e -> System.out.println(e.getAge()));

        IntStream unoAVeinte = IntStream.rangeClosed(1,20);
        unoAVeinte.forEach(System.out::println);
    }
}
