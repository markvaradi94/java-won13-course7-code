package ro.fasttrackit.homework.bottle;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = 0;
        this.open = false;
    }

    public Bottle(int totalCapacity, boolean open) {
        this.totalCapacity = totalCapacity;
        this.open = open;
        this.availableLiquid = 0;
    }

    public Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean hasMoreLiquid() {
        return availableLiquid > 0;
    }

    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String open() {
        if (open) {
            return "Bottle is already opened";
        }
        open = true;
        return "Bottle is opened";
    }

    public String close() {
        if (!open) {
            return "Bottle is already closed";
        }
        open = false;
        return "Bottle is closed";
    }

    public String drink(int amountToDrink) {
        open();
        if (availableLiquid >= amountToDrink) {
            availableLiquid -= amountToDrink;
            close();
            return "You drank: " + amountToDrink;
        } else {
            int consumedLiquid = availableLiquid;
            availableLiquid = 0;
            close();
            return "Not enough liquid. You drank " + consumedLiquid;
        }
    }

    private void bottleSaysHi() {
        System.out.println("Hi");
    }

    protected void bottleSaysHello() {
        System.out.println("Hi");
    }

    void defaultTest() {
        System.out.println("I'm a default method");
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "totalCapacity=" + totalCapacity +
                ", availableLiquid=" + availableLiquid +
                ", open=" + open +
                '}';
    }
}
