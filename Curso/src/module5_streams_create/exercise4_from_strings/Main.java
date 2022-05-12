package module5_streams_create.exercise4_from_strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //caracteres q no son digito y no espacios en blanco
        IntStream stream =
                input.chars()
                        .filter(c -> !Character.isDigit((char)c)
                                && !Character.isWhitespace((char)c));
        stream.forEach(n -> System.out.print((char)n));
        String str = "HTML, JAVA, CSS, JAVASCRIPT";
        Pattern.compile(", ")
                .splitAsStream(str).forEach(System.out::println);


    }
}
