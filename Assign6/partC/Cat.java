package Assignment6.partC;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Pet implements Boardable{
    private String hairLength;

    protected int boardingStartMonth;
    protected int boardingStartDay;
    protected int boardingStartYear;
    protected int boardingEndMonth;
    protected int boardingEndDay;
    protected int boardingEndYear;

    Date boardingStart = new Date(boardingStartMonth,boardingStartDay,boardingStartYear);
    Date boardingEnd = new Date(boardingEndMonth,boardingEndDay,boardingEndYear);

    //Date SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    public Cat(String name, String ownerName, String color, String hairLength){
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    String getHairLength(){

        return this.hairLength;
    }

    @Override
    public void setBoardStart(int month, int day, int year) {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        //Date boardingStart = sdf.parse("2019-10-01");
        boardingStartDay = day;
        boardingStartMonth = month;
        boardingStartYear = year;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        Date boardingEnd = new Date(month,day,year);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        boardingEndDay = day;
        boardingEndMonth = month;
        boardingEndYear = year;
     }

    @Override
    public boolean boarding(int month, int day, int year){
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        //Date boardingStart = sdf.parse("");

        Date date1 = new Date(month,day,year);
        if((date1.after(boardingStart))&& (date1.before(boardingEnd)) ){
            System.out.println(getName()+" is boarding in this time.");
            return true;
        }
        else System.out.println(getName()+ " is not boarding in this time.");
            return false;
    }

    public String toString(){
        return  "CAT: "+ '\n' +
                super.toString() +
                "Hair: " + getHairLength();
    }

}

// Simple Unit Test
class CatTester{
    public static void main(String[] args) {
        Cat nyang = new Cat("NyangChang","Jackie","Black","short");
        nyang.setBoardStart(8,8,2015);
        nyang.setBoardEnd(10,14,2019);
        Pet.makeGenderMap();
        nyang.setSex(2);

        System.out.println(nyang.toString());

        System.out.println(nyang.boarding(7,7,2018));
    }

}
