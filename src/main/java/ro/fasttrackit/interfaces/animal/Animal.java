package ro.fasttrackit.interfaces.animal;

public interface Animal {
    String KINGDOM = "Africa";
    // final field means its value cannot changed

    String getName();

    default void makeSound() {
        validateImplementation();
        commonBehaviour();
        System.out.println("Grrr");
    }

    default void eat() {
        System.out.println(getName() + " eats food");
    }

    default void validateImplementation() {
        if (getName().isEmpty()) {
            System.out.println("Invalid name");
        }
    }

    private void commonBehaviour() {  // private methods are intended to be used inside the interface
        System.out.println("I am an animal from " + KINGDOM);
        System.out.println("Most animals breathe and move");
    }
}
