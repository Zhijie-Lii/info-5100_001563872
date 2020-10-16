package Assign5;

public class DessertShoppe {
    public DessertShoppe(){
        this.nameOfStore = "M & M Dessert Shoppe";
    }

   // public DessertShoppe(String nameOfStore){

     ;
  //  }

    public static String getNameOfStore() {
        return nameOfStore;
    }

    public static float getTaxRate() {
        return taxRate;
    }

    public static double cents2dollarsAndCents(float cents){
        double numberInDollars = cents /100;
        return numberInDollars;
    }

    private static float taxRate = 0.065f;
    private static String nameOfStore;
    private static int maxSizeOfName = 30;
    private int widthOfCost = 5;



}

