package module2_functional_interfaces.exercise6_consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        //La diferencia con function es que esta no devuelve valores
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Marcos");

        List<Student> studentList = Arrays.asList(
                new Student("Javier",5),
                new Student("Marcos",6),
                new Student("Lugo",3),
                new Student("Maria",1),
                new Student("Marina",10),
                new Student("Petra",9),
                new Student("Potter",7)
        );
        OperationStudents operationStudents = new OperationStudents();
        Consumer<Student> consumer2 = s -> System.out.println("Name: "+s.getName()+" Calification: "+s.getCalification());
        Consumer<Student> consumer3 = s -> s.setCalification(s.getCalification()*1.15);

        operationStudents.acceptALl(studentList,consumer2);
        operationStudents.acceptALl(studentList,consumer3);
        System.out.println();
        System.out.println("CALIFICACION ACTUALIZADA");
        operationStudents.acceptALl(studentList,consumer2);

        //Realiza las dos en uno
        System.out.println();
        System.out.println("CALIFICACION ACTUALIZADA EN UN METODO");
        Consumer<Student> consumer4 = consumer2.andThen(consumer3);
        operationStudents.acceptALl(studentList,consumer4);
    }
}
