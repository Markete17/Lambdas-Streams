package module2_functional_interfaces.exercise1_function;

import java.util.function.Function;

// Ejercicio 1 - Interfaz funcional predeterminada: Function
public class RestaurantData {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Javier",256.2,5);
        String name = (String) getRestaurantData(restaurant, x -> x.getName());
        int table = (int) getRestaurantData(restaurant, x->x.getNumTable());
        System.out.println("Restaurant Name: "+name);
        System.out.println("Restaurant Table: "+table);
    }

    public static Object getRestaurantData(Restaurant r, Function<Restaurant,Object> f){
        return f.apply(r);
    }
}
