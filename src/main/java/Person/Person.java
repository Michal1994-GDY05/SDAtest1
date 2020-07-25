package Person;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private String wifesName;
    private int noOfKids;
    private LocalDate dateOfBirth;
    private long id;


    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String wifesName, int noOfKids, LocalDate dateOfBirth, long id, int weight) {
        this.name = name;
        this.age = age;
        this.wifesName = wifesName;
        this.noOfKids = noOfKids;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.weight = weight;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
