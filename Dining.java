package Prince;

public class Dining implements Expense {
    private Destination destination;
    private int nights;

    public Dining(Destination destination, int nights) {
        this.destination = destination;
        this.nights = nights;
    }

    public float getCost() {
       float total;
       float dayCost = 0;

       switch (destination)
       {
           case mexico: dayCost = 10;
               break;
           case europe: dayCost = 20;
               break;
           case japan: dayCost = 30;
               break;
       }

       total = dayCost * nights;
       return total;
    }
}
