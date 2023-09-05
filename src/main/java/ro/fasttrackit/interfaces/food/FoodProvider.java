package ro.fasttrackit.interfaces.food;

public interface FoodProvider {
    default boolean makePayment(double amount) {
        if (validatePayment(amount)) {
            pay(amount);
            return true;
        }

        return false;
    }

    boolean pay(double amount);

    String deliverFood();

    int getDeliveredQuantity();


    private boolean validatePayment(double amount) {
        if (validateAmount(amount)) {
            System.out.println("Not enough");
            return false;
        }
        return true;
    }

    private boolean validateSender(String sender) {
        return "VERIFIED".equals(sender);
    }

    private boolean validateAmount(double amount) {
        return amount < 10;
    }
}
