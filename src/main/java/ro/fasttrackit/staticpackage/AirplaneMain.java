package ro.fasttrackit.staticpackage;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Type 1", 2.0);
        Airplane a2 = new Airplane("Type 2", 3.0);

        a1.setType("Type 3");
        a2.setType("Type 4");
        System.out.println(a1.getType());

        a1.setGravityCoefficient(1.5);
        a2.setGravityCoefficient(3.2);
        System.out.println(a1.getGravityCoefficient());
        a2.getFuel();

        Airplane a3 = new Airplane("other type", 1.0);
        System.out.println(a3.getGravityCoefficient());

//        sum(1 , 3);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
