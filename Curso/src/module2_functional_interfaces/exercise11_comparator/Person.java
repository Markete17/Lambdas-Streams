package module2_functional_interfaces.exercise11_comparator;

import java.util.Date;

public class Person implements Comparable<Person>{
    private Long id;
    private String name;
    private Date date;

    public Person(Long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.getName());
    }
}
