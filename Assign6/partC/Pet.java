package Assignment6.partC;

import java.nio.channels.NotYetBoundException;
import java.util.HashMap;
import java.util.Map;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class Pet {
    private String name;
    private String ownerName;
    private String color;
    protected static int sex;

    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 0;

//        static final 1 =parseInt("MALE");
//        static final 2 =parseInt("FEMALE");
//        static final 3 =parseInt("SPAYED");
//        static final 4 =parseInt("NEUTERED");

        public static final Map<Integer, String>genderMap = new HashMap<>();

        protected final static void makeGenderMap(){
            genderMap.put(1,"MALE");
            genderMap.put(2,"FEMALE");
            genderMap.put(3,"SPAYED");
            genderMap.put(0,"NEUTERED");
        }

//    static final int 1 = Integer.valueOf("MALE");
//    static final int 2 = Integer.valueOf("MALE");

    public Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public String getColor(){
        return this.color;
    }

    public void setSex(int sexid){
        //this.sex = genderMap.get(sexid);
//        if ((sexid !=0)||(sexid !=1)||(sexid!=2)||(sexid!=3)){
//            throw NotYetBoundException;
//        }
        this.sex = sexid;
    }

    public String getSex(){
        //return String.valueOf(sex);
        return  genderMap.get(this.sex);
    }

    @Override
    public String toString() {
        return  getName() +
                " owned by " + getOwnerName() + '\n' +
                "Color: " + getColor() + '\n' +
                "Sex: " + getSex() + '\n';
    }
}
