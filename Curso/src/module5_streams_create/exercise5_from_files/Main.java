package module5_streams_create.exercise5_from_files;

import module5_streams_create.StudentBasic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Path path = Paths.get("src/module5_streams_create/text.txt");
        try (Stream<String> lines = Files.lines(path)){
            lines.forEach(l -> {
                System.out.println("Line....");
                System.out.println(l);
            });
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
