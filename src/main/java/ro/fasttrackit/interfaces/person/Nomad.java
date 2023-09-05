package ro.fasttrackit.interfaces.person;

public class Nomad implements Person {
    private String name;
    private int age;

    public Nomad(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
