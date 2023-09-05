package ro.fasttrackit.staticpackage;

public class Airplane {
    public static double GRAVITY_COEFFICIENT;
    public static int MAX_PASSENGERS = 200;
    private String type;
    private double fuel;


    public Airplane(String type, double fuel) {
        this.type = type;
        this.fuel = fuel;

        int maxValue = Integer.MAX_VALUE;
    }

    public String getType() {
        return type;
    }

    public double getFuel() {
        GRAVITY_COEFFICIENT++;
        return fuel;
    }

    public static double getGravityCoefficient() {
//        fuel++;

//        getType();
        return GRAVITY_COEFFICIENT;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void setGravityCoefficient(double gravityCoefficient) {
        GRAVITY_COEFFICIENT = gravityCoefficient;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "type='" + type + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
