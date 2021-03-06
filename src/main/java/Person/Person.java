package Person;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private String wifesName;
    private int noOfKids;
    boolean hasADod;
    private int trzeciCommit;
	private int age2;
	private String L4;


    private LocalDate dateOfBirth;

    private int weight;
    private int height;
    private int cash;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

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

    public Person(String name, int age, String wifesName, int noOfKids, LocalDate dateOfBirth) {
        this.name = name;
        this.age = age;
        this.wifesName = wifesName;
        this.noOfKids = noOfKids;
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
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

    public String getL4() {
        return L4;
    }

    public void setL4(String l4) {
        L4 = l4;
    }

    public int getTrzeciCommit() {
        return trzeciCommit;
    }

    public void setTrzeciCommit(int trzeciCommit) {
        this.trzeciCommit = trzeciCommit;
    }
