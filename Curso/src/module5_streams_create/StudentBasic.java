package module5_streams_create;

public class StudentBasic {
    private String id;
    private Integer age;
    private Double height;
    private Double average;

    public StudentBasic(String id, Integer age, Double height, Double average) {
        this.id = id;
        this.age = age;
        this.height = height;
        this.average = average;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }
}
