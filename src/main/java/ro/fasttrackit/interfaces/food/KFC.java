package ro.fasttrackit.interfaces.food;

public class KFC implements FoodProvider {
    private static int pricePerItem = 20;
    private int quantity = 0;
    private int amountToPay = 0;

    public boolean pay(double amount) {
        if (amount > 0 && amount <= amountToPay) {
            amountToPay -= amount;
            System.out.println("KFC was paid " + amount);
            System.out.println("Amount to pay left " + amountToPay);
            return true;
        }
        return false;
    }

    public String deliverFood() {
        quantity++;
        amountToPay += pricePerItem;
        return "Crispy";
    }

    public String getSender() {
        return "VERIFIED";
    }

    public int getDeliveredQuantity() {
        return quantity;
    }
}
