package Prince;

public class Lodging implements Expense {
    private Destination destination;
    private int nights;

    public Lodging(Destination destination, int nights) {
        this.destination = destination;
        this.nights = nights;
    }

    public float getCost() {
        float total;
        float dayCost = 0;
        double tax = 0;

        switch (destination) {
            case japan:
                dayCost = 300;
                tax = (0.3);
                break;
            case europe:
                dayCost = 200;
                tax = (0.1);
                break;
            case mexico:
                dayCost = 100;
                tax = 0;
                break;
        }

        total = (nights * dayCost);
        total += total * tax;
        return total;
    }
}
