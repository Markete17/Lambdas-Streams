package module2_functional_interfaces.exercise6_consumer;

import java.util.List;
import java.util.function.Consumer;

public class OperationStudents {
    public void acceptALl(List<Student> studentList, Consumer<Student> consumer){
        for(Student student:studentList){
            consumer.accept(student);
        }
    }
}
