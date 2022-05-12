package module2_functional_interfaces.exercise8_supplier;

import java.util.function.Supplier;

//Lo contrario a Consumer
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> i = () -> "Pepe";
        System.out.println(i.get());
    }
}
