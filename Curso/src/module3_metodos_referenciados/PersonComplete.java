package module3_metodos_referenciados;

public class PersonComplete {
    private String name;
    private Integer age;
    private String email;

    public PersonComplete(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonComplete{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
    //METODO REFERENCIADO
    public static int compareAge(PersonComplete p1,PersonComplete p2){
        return p1.getAge().compareTo(p2.getAge());
    }
    public int compareAge2(PersonComplete p1){
        return this.getAge().compareTo(p1.getAge());
    }
}
