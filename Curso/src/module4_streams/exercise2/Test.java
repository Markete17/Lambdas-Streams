package module4_streams.exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        // Suma elementos impares
        int sum  = nums.stream()
                .filter( n -> n%2 !=0)
                .map( (n) -> n*n )
                .reduce(0, Integer::sum);
                //.reduce(0, (n1,n2) -> n1+n2);
        System.out.println(sum);
    }
}
