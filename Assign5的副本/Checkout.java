package Assign5;

import java.lang.Object.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Checkout extends Object{
    //public Vector v = new Vector();
    public Vector<DessertItem> v = new Vector<>();

    public int numberOfItems(){
        return v.size();
    }

    public void enterItem(DessertItem item){
        //v.addElement(item);
        v.add(item);
        System.out.println();
    }

      public void clear(){
        v.clear();
    }

    public int totalCost(){
        int total = 0;
        for(int i=0; i<v.size();i++){
            total += v.get(i).getCost();
        }
        return total;
    }

    public int totalTax(){

        double tax1 = totalCost()* DessertShoppe.getTaxRate();
        BigDecimal tax2 = new BigDecimal(tax1);
        int tax = tax2.setScale(0, RoundingMode.HALF_UP).intValue();
        return tax;
    }

    public int afterTax(){
        int AfterTax = totalCost() + totalTax();
        return AfterTax;
    }


    public String toString(){
        DessertShoppe d= new DessertShoppe();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(DessertShoppe.getNameOfStore());
        stringBuilder.append("\n--------------------\n");

        for(DessertItem i: v){

            if (i instanceof Candy) {
                stringBuilder.append(v.toString());
                //                stringBuilder =  weight + " lbs. @ " +
                //                        + DessertShoppe.cents2dollarsAndCents(pricePerPound) +
                //                        " /lb."
            }
            if (i instanceof Cookie) {
                stringBuilder.append(v.toString());
            }
            if (i instanceof Sundae) {
                stringBuilder.append(v.toString());
            }
            if (i instanceof IceCream) {
                stringBuilder.append(v.toString());
            }

        }
//        stringBuilder.append("\nTax "+ DessertShoppe.cents2dollarsAndCents(checkout.totalTax()));
//        stringBuilder.append("\nTotal Cost "+ DessertShoppe.cents2dollarsAndCents(afterTax()));

        return stringBuilder.toString();
    }


}
