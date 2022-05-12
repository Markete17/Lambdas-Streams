package module2_functional_interfaces.exercise6_consumer;

public class Student {
    private String name;
    private double calification;

    public Student(String name, double calification) {
        this.name = name;
        this.calification = calification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalification() {
        return calification;
    }

    public void setCalification(double calification) {
        this.calification = calification;
    }
}
