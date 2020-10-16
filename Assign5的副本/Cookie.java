package Assign5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cookie extends DessertItem {
    public Cookie(String name, int number, int pricePerDozen) {
        super(name);
        this.number = number;
        this.pricePerDozen =pricePerDozen;
    }

    private int pricePerDozen;
    private int number;

    @Override
    public final int getCost() {
        double costOfCookie1 = pricePerDozen * number / 12;
        //int costOfCookie = (int) Math.round(costOfCookie1);
        BigDecimal costOfCookie2 = new BigDecimal(costOfCookie1);
        int costOfCookie= costOfCookie2.setScale(0, RoundingMode.HALF_UP).intValue();
        return costOfCookie;
    }

    @Override
    public String toString() {
        return  number + " @ " +
                +DessertShoppe.cents2dollarsAndCents(pricePerDozen) +
                " /dz." + "\n" + getName() + "\t" +
                DessertShoppe.cents2dollarsAndCents(getCost()) +"\n";
    }
}