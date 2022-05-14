package module6_operations;

public class Human implements Comparable{
    private Long id;
    private String name;
    private Double salary;
    private String genre;
    private Integer age;

    public Human(Long id, String name, Double salary, String genre, Integer age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.genre = genre;
        this.age = age;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean isMen(){
        return this.genre == "M";
    }

    public Boolean isWoman(){
        return this.genre == "W";
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", genre='" + genre + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo( ((Human)o).getName() );
    }
}
