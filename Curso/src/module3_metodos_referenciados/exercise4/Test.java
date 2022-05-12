package module3_metodos_referenciados.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        List<String> nums = Arrays.asList(
                "10","20","30","40"
        );
        //System.out.println(getResults(nums, (p) -> Integer.parseInt(p)));
        // es igual a
        getResults(nums, Integer::parseInt).forEach(e -> System.out.println(e*100));
    }

    public static List<Integer> getResults(List<String> data, Function<String,Integer> function){
        List<Integer> output = new ArrayList<>();

        data.forEach( e -> output.add(function.apply(e)));
        return output;
    }
}
