package ro.fasttrackit.interfaces.food;

public class InterfacesMain {
    public static void main(String[] args) {
        Company company = new Company();
        company.setFoodSource(new KFC());
        company.sendFoodToEmployees();
        System.out.println("================================");
        company.makePayment();
        System.out.println("================================");

        company.setFoodSource(new McDonalds());
        company.sendFoodToEmployees();
        company.makePayment();
    }
}
