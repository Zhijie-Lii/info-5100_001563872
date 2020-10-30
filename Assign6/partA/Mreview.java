package Assignment6.partA;

import java.util.*;

public class Mreview implements Comparable<Mreview> {
    private String title;
    private ArrayList<Integer> ratings;

    Mreview(){}

    Mreview(String title){
        this.title = title;
        ratings = new ArrayList<>();
    }

    Mreview(String title, ArrayList<Integer>ratings){
        this.title = title;
        //ratings.add(firstRating);
        this.ratings =ratings;
    }

    public void addRating(int r){
        ratings.add(r);
    }

    public double aveRating(){
        double average;
        int sum = 0;
        for (Integer r: ratings){
            //sum += ratings.get(r);
            sum += r;
        }
        average = sum / ratings.size();
        return average;
    }

    public String getTitle(){
        return title;
    }

    public int numRatings(){
        return ratings.size();
    }

    public int compareTo(Mreview obj){
        return title.compareTo(obj.getTitle());
    }

    public boolean equals(Mreview obj){
        if (title.equals(obj.getTitle())){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return  getTitle() + ", average " +
                aveRating() + " out of " +
                numRatings() + " ratings";
    }


    public static void main(String[] args) {
        Mreview Kill_Bill = new Mreview("Kill_Bill");
        Kill_Bill.addRating(3);
        Kill_Bill.addRating(4);
        Kill_Bill.addRating(3);
        System.out.println(Kill_Bill.aveRating());
        System.out.println(Kill_Bill.toString());

        Mreview WanderingEarth = new Mreview("Wandering_Earth");
        WanderingEarth.addRating(5);
        WanderingEarth.addRating(3);
        WanderingEarth.addRating(3);
        System.out.println(WanderingEarth.toString());
        System.out.println(Kill_Bill.equals(WanderingEarth));

    }
}




