package module2_functional_interfaces.exercise1_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Ejercicio 1 - Interfaz funcional predeterminada: Function
public class RestaurantDatas {

    public static void main(String[] args) {
    List<Restaurant> restaurantList = Arrays.asList(
            new Restaurant("Javier",256.2,5),
            new Restaurant("Marcos",256.2,5),
            new Restaurant("Rodri",256.2,5),
            new Restaurant("Guille",256.2,5));
    List<Object> names = getData(restaurantList, x -> x.getName());
    System.out.println(names);
    List<Object> prices = getData(restaurantList, x -> x.getMnt_order());
    System.out.println(prices);
    }

    // Guarda datos personalizados de los restaurantes
    public static List<Object> getData(List<Restaurant> restaurantList, Function<Restaurant,Object> f){
        List<Object> dataList = new ArrayList<>();

        for (Restaurant r: restaurantList){
            dataList.add(f.apply(r));
        }

        return dataList;
    }
}
