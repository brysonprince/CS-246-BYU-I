package Prince;

public class Cruise implements Expense {
    private float cost;
    private Destination destination;

    public Cruise(Destination destination) {
        this.destination = destination;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public float getCost() {
        switch (destination)
        {
            case mexico: cost = 1000;
                break;
            case europe: cost = 2000;
                break;
            case japan: cost = 3000;
                break;
        }
        return cost;
    }
}
