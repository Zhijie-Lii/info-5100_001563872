package Assignment6.partC;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Pet implements Boardable{
    private String size;

    protected int boardingStartMonth;
    protected int boardingStartDay;
    protected int boardingStartYear;
    protected int boardingEndMonth;
    protected int boardingEndDay;
    protected int boardingEndYear;

    Date boardingStart = new Date(boardingStartMonth,boardingStartDay,boardingStartYear);
    Date boardingEnd = new Date(boardingEndMonth,boardingEndDay,boardingEndYear);

    public Dog(String name, String ownerName, String color, String size){
        super(name, ownerName, color);
        this.size =size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "DOG: " + '\n' +
                super.toString() +
                "Size: " + getSize();
    }

    public void setBoardStart(int month, int day, int year) {
        boardingStartDay = day;
        boardingStartMonth = month;
        boardingStartYear = year;
    }

    public void setBoardEnd(int month, int day, int year) {
        boardingEndDay = day;
        boardingEndMonth = month;
        boardingEndYear = year;
    }

    public boolean boarding(int month, int day, int year){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = new Date(month,day,year);
        if((date1.after(boardingStart))&& (date1.before(boardingEnd)) ){
            System.out.println(getName()+" is boarding in this time.");
            return true;
        }
        else System.out.println(getName()+ " is not boarding in this time.");
            return false;
    }
}

class DogTester{
    // Simple Unit Test
    public static void main(String[] args) {
        Dog mophie = new Dog("Morphie","Racheal","Black and white","medium");
        mophie.setBoardStart(9,1,2014);
        mophie.setBoardEnd(7,1,2018);
        Pet.makeGenderMap();
        mophie.setSex(0);
        System.out.println(mophie.toString());

        System.out.println(mophie.boarding(9,8,2016));
    }
}
