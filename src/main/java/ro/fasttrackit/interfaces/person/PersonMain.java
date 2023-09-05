package ro.fasttrackit.interfaces.person;

public class PersonMain {
    public static void main(String[] args) {
        Person[] abductedByAliens = new Person[10];
        Citizen[] citizensOfHonor = new Citizen[10];
        Employee[] employeesOfTheMonth = new Employee[10];

        Nomad attila = new Nomad("Attila", 65);
        abductedByAliens[0] = attila;
        citizensOfHonor[0] = attila; // compilation error
        employeesOfTheMonth[0] = attila;


        Romanian gicu = new Romanian("RO", 123L, 25, "Gicu");
        abductedByAliens[1] = gicu;
        citizensOfHonor[1] = gicu;
        employeesOfTheMonth[1] = gicu;

        for (int i = 0; i < abductedByAliens.length; i++) {
            abductedByAliens[i].getAge();
        }
    }
}
