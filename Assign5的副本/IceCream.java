package Assign5;

public class IceCream extends DessertItem{
    private String name;
    private int priceForEach;

    public IceCream(String name, int priceForEach){
        super(name);
        this.priceForEach = priceForEach;
    }

    public IceCream() {
    } // Why with this default constructor? for the sundae

//    @Override
//    public String getName() {
//        return name;
//    }

    @Override
    public int getCost() {
        return (int) (priceForEach);
    }

    @Override
    public String toString() {
        return getName() + "\t" + getCost()/100 +"\n";
    }
}
