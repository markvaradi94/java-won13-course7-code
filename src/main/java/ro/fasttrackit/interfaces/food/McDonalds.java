package ro.fasttrackit.interfaces.food;

public class McDonalds implements FoodProvider {
    private static int pricePerItem = 15;
    private int quantity = 0;
    private int amountToPay = 0;

    public boolean pay(double amount) {
        if (amount > 0 && amount <= amountToPay) {
            amountToPay -= amount;
            System.out.println("McDonalds was paid " + amount);
            System.out.println("Amount to pay left " + amountToPay);
            return true;
        }
        return false;
    }

    public String deliverFood() {
        quantity++;
        amountToPay += pricePerItem;
        return "Burger";
    }

    public int getDeliveredQuantity() {
        return quantity;
    }
}
