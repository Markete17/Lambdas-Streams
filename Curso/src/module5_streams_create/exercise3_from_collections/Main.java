package module5_streams_create.exercise3_from_collections;

import module5_streams_create.StudentBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream numStream = Arrays.stream(new int[]{1,2,3,45,6});
        numStream.forEach(System.out::println);

        Stream<String> names = Arrays.stream(new String[]{"hola","adios"});
        names.forEach(System.out::println);

        List<StudentBasic> studentBasicList = Arrays.asList(
                new StudentBasic("ID_1",20,1.60,1.4),
                new StudentBasic("ID_2",30,1.70,1.4),
                new StudentBasic("ID_3",40,1.80,1.4),
                new StudentBasic("ID_4",50,1.90,1.4)
        );
        //Con paralelStream se puede trabajar con el stream de forma paralela
        Stream<StudentBasic> studentBasicStream = studentBasicList.parallelStream();
        studentBasicStream.forEach(System.out::println);

    }
}
