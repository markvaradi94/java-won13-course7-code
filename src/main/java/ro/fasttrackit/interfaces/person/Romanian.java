package ro.fasttrackit.interfaces.person;

public class Romanian implements Citizen, Employee {
    private String citizenship;
    private long identifier;
    private int age;
    private String name;

    public Romanian(String citizenship, long identifier, int age, String name) {
        this.citizenship = citizenship;
        this.identifier = identifier;
        this.age = age;
        this.name = name;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public long getIdentifier() {
        return identifier;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return null;
    }

    public int getSalary() {
        return 0;
    }
}
