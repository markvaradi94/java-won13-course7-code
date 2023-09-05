package ro.fasttrackit.interfaces.food;

public class Company {
    private int numberOfEmployees = 10;
    private FoodProvider foodSource;

//    private PizzaHut foodSource;  // tight coupling


//    public Company(PizzaHut foodSource) {
//        this.foodSource = foodSource;
//    }

    public void sendFoodToEmployees() {
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(foodSource.deliverFood());
        }
    }

    public void makePayment() {
        foodSource.makePayment(50);
    }

    public void setFoodSource(FoodProvider foodSource) {
        this.foodSource = foodSource;
    }
}
