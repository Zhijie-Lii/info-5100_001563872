package Assignment6.partC;

import java.text.SimpleDateFormat;
import java.util.Date;

interface Boardable {


    public void setBoardStart(int month, int day, int year);


    public void setBoardEnd(int month, int day, int year);


    public boolean boarding(int month, int day, int year);

    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
}

