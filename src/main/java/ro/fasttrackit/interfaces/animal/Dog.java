package ro.fasttrackit.interfaces.animal;

public class Dog implements Animal{
    private String name;

    public Dog(String name) {
        String kingdom = Animal.KINGDOM;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        validateImplementation();
        System.out.println("Woof");
    }
}
