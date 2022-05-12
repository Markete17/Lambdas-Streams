package module4_streams.exercise1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int sum = nums.stream()
                .filter(n -> n%2 == 0)
                .map(n -> n*n)
                .reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
