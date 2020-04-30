package Prince;

import java.util.ArrayList;
import java.util.List;

public class VacationCalculator {

    public static void main(String[] args) {
	    VacationCalculator vc = new VacationCalculator();
	    int nights = 5;

	    //Calculate
	    float japanCost = vc.calculateVacationCost(Destination.japan, nights);

	    //Print the results
	    System.out.format("The cost of your trip will be $%1$.02f%n", japanCost);
    }

    public float calculateVacationCost(Destination dest, int nights) {
        float cost;
        List<Expense> expenses = new ArrayList<>();
        Expense cruise = new Cruise(dest);
        Expense lodging = new Lodging(dest, nights);
        Expense dining = new Dining(dest, nights);
        expenses.add(cruise);
        expenses.add(lodging);
        expenses.add(dining);

        cost = tallyExpenses(expenses);
        return cost;
    }

    float tallyExpenses(List<Expense> expenses) {
        float total = 0;

        for (int i = 0; i < expenses.size(); i++)
        {
            total += expenses.get(i).getCost();
        }
        return total;
    }
}
