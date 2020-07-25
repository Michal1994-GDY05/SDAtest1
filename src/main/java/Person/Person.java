package Person;

public class Person {

    private String name;
    private int age;
    private String wifesName;
    private int noOfKids;
    boolean hasADod;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    public Person(boolean hasADod) {
        this.hasADod = hasADod;
    }

    public boolean isHasADod() {
        return hasADod;


    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
