package module2_functional_interfaces.exercise7_biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<Double,Double> biConsumer = (n1,n2) ->
        {double mult = n1*n2;
            System.out.println(mult);
        };
        biConsumer.accept(1.23,3.23);

        //BiConsumer aplicado a un mapa en la funcion for each
        Map<String,String> map = new HashMap<>();
        map.put("Chris","USA");
        map.put("Marcos","Spain");
        map.put("Pierer","France");
        map.forEach(
                (key,value) ->
                        System.out.println("KEY: "+key+" VALUE: "+value));
    }
}
