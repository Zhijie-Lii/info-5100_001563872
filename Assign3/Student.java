public class Student{
    private String name;
    private double id;

    public void Student(String name, double id){
    //constructor
        this.name=name;
        this.id=id;
    }

    public String getName() {
        System.out.println(this.name);
        return name;
    }

    public double getId() {
        System.out.println(this.id);
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}

