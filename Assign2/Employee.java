public class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
        //write your code here
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    // Getter for `name`. Return the current `name` data
    public String getName() {
        //write your code here
        return this.name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
        //write your code here
        this.name = name;
    }

    // Try to add a new method in Employee class:
    public void raiseSalary(double byPercent) {
        this.salary = this.salary * byPercent / 100.0;
    }
}

enum Gender {
    MALE,
    FEMALE;
}

class Assignment2_1 {
    private static Employee jackie;
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of  (106,800?).
     */


    public static double socialSecurityTax(Employee e) {
        //write your code here
        double tax ;
        if (e.salary>8900){
            tax = 10680*6.2/100;
        } else{
            tax = e.salary*6.2/100;
        }
        System.out.println("The social security tax of " +e.name + " = " + tax );
        return tax;
    }

    /**public static void main(String[] args){
        Employee("jackie, 23, male, 8000"){
            this.name= jackie;
            this.gender= male;
            this.age= 23;
            this.salary= 8000;
            jackie.getName();
            jackie.socialSecurityTax(jackie);
        }
    }*/
    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */

    public static double insuranceCoverage(Employee e) {
        //write your code here
        double coverage;
        int age = e.age;
        double salary = e.salary;
        if (age<35){ coverage= salary*3/100; }
        else if ( age<=50 ){ coverage= salary*4/100; }
        else if(age<=60) {coverage = salary*5/100;}
        else { coverage = salary*6/100;}

        System.out.println("The insurance coverage of " + e.name+ " = " +coverage);
        return coverage;
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
        double s1=e1.salary;
        double s2=e2.salary;
        double s3=e3.salary;
        if (s1>s2) {
            if (s1<s3) {
                System.out.println("e2.name, e1.name, e3.name");
            } else {
                if (s2<=s3)  {
                    System.out.println("e2.name e3.name e1.name");
                } else {
                    System.out.println("e3.name e2.name e1.name");
                }
            }
        } else {
            if (s2<=s3) {
                System.out.println("e1.name e2.name e3.name");
            }
            else {
                if (s1<=s3) {
                    System.out.println("e1.name e3.name e2.name");
                }
                else {
                    System.out.println("e3.name e1.name e2.name");
                }
            }
        }
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
     */
    public static void raiseSalaryToThreeTimes(Employee e) {
        e.raiseSalary(300);
    }

    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
/*
 write your understanding here.
    a and b are instance variables initialized in the main method,
    and temp is a local variable initialized in the swap method.
*/
    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    //    return (x,y);
    }


    public static void main(String[] args) {
               // double ssTax = new ssTax ;
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        Employee c = new Employee("Jackie",23,Gender.MALE,3000);
        Employee d = new Employee("Cheddle",50,Gender.MALE,8000);

        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());

        a.setName("zhijie");
        c.raiseSalary(150);
        raiseSalaryToThreeTimes(b);
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());

        socialSecurityTax(c) ;
        insuranceCoverage(d);
        System.out.println(a.salary);
        System.out.println(b.salary);
        System.out.println(c.salary);
        sortSalary(b,c,d);

    }


}


