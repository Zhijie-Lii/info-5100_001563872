import java.util.Arrays;

public class Course {
    private String name;
    int numberOfStudent;
    Student[] students= new Student[0];

    public Course(String name, int numberOfStudent){
        this.name= name;

        numberOfStudent = students.length;
       // numberOfStudent = a[].length

    }

    public Student[] getStudent(){
        for (Student s: students)
            System.out.println(this.name);
        return students;
    }

    public String getName(){
        return name;
    }

    public boolean isFull(){
        boolean isFull = false;
        if (numberOfStudent < 10) {
            System.out.println(false);
        }
        if (numberOfStudent == 10) {
            System.out.println(true);
        }
        return false;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public Student[] registerStudent(Student student) {
        int n=students.length;
        Student[] newStudents = new Student[n + 1];
        if (students.length < 10) {
            int i;
            for (i = 0; i < n; i++)
                newStudents[i] = students[i];
            newStudents[n] = student;

        }
        return newStudents;
    }
}

class Test{

    public static void main(String[] args) {
        Course java = new Course("INFO-5100",0);
        Student zhijie = new Student();
        Student mingjai = new Student();

        zhijie.setId(1563872);
        zhijie.setName("Zollic");
        zhijie.getId();
        zhijie.getName();

        java.registerStudent(zhijie);
        java.registerStudent(mingjai);
        System.out.println(java.getName());
        System.out.println(java.getNumberOfStudent());
        java.isFull();
        java.getStudent();

        Professor siva = new Professor.Builder("Siva","Dosapati")
                .setTeachingSubject("JAVA")
                .setId(456789).build();

        System.out.println(siva.getLastName());
        System.out.println(siva.getId());
        System.out.println(siva.getTeachingSubject());
    }
}
