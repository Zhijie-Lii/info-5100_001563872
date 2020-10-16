package Assign5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class DessertItem {
    protected String name;

    public DessertItem(){

    }

    public DessertItem(String name){
        this.name =name;
    }

    public final String getName() {
        return name;
    }

    public abstract int getCost();
}



