package Assign5;

public class Sundae extends IceCream{
    private String toppingName;
    private int CostOfTopping;

    public Sundae(String name,int priceForEach, String toppingName, int costOfTopping){
        super(name,priceForEach);
        this.costOfTopping = costOfTopping;
        this.toppingName = toppingName;
    }

    private int costOfTopping;

    @Override
    public final int getCost() {
        int cost = super.getCost()+ costOfTopping;
        return cost;
    }

    @Override
    public String toString() {
        return toppingName + " Sundae with" +"\n"
                + super.toString() ;
    }
}
