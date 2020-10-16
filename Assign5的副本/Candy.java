package Assign5;

import java.math.*;

public class Candy extends DessertItem{
    public Candy(String name,double weight,int pricePerPound){
        super(name);
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    private int pricePerPound ;
    private double weight;

    @Override
    public final int getCost() {
        double costOfCandy1 =  weight*pricePerPound;
        BigDecimal costOfCandy2 = new BigDecimal(costOfCandy1);
        int costOfCandy = costOfCandy2.setScale(0, RoundingMode.HALF_UP).intValue();
        // it's still safe when the price is always positive number using Math.round method
        //int costOfCandy = (int) Math.round(costOfCandy1);
        return costOfCandy;
    }

    @Override
    public String toString() {
        return weight + " lbs. @ " +
                + DessertShoppe.cents2dollarsAndCents(pricePerPound) +
                " /lb." + "\n" + getName() +"\t"
                + DessertShoppe.cents2dollarsAndCents(getCost()) +"\n";

    }
}
