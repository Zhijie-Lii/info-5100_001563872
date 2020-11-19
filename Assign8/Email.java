package emailapp;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Email {

    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";
    private String firstName;
    private String lastName;
    private String department;
    private String companyEmail;
    private String password;

    private File file = new File("EmployeeEmail.data");

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) throws IOException {
        this.firstName = firstName;
        this.lastName = lastName;
        SetDepartment();

        addEmailIntoFile(firstName+" "+lastName);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // Ask for the department
    private void SetDepartment() {
        Scanner scanner = new Scanner(System.in);
        // while(true) ?
        StringBuffer buffer = new StringBuffer();
        buffer.append("New Worker: ").append(firstName).append(" ")
                .append(lastName).append(". ").append("Department Code:")
                .append("\n").append("1 for Sales").append("\n")
                .append("2 for Development").append("\n")
                .append("3 for Accounting").append("\n")
                .append("0 for none").append("\n")
                .append("Enter department code:");
        System.out.println(buffer.toString());

        int number = Integer.parseInt(scanner.nextLine());
        //scanner.nextLine can't be a int?

        if(number ==1){
            department = "sale";
        }
        else if(number==2){
            department = "dev";
        }
        else if(number==3){
            department = "acc";
        }
        else if(number==0){}
        else{
            System.out.println("Please input the valid code of department");
        }
        addEmailIntoFile(department);
        addEmailIntoFile(generateCompanyEmail());
        addEmailIntoFile(randomPassword());
        addEmailIntoFile(String.valueOf(mailboxCapacity));

        scanner.close();

//        try {
//            showInfo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return str.toString();
//        return String.valueOf(str);
    }

//    public String getDepartment() {
//        return department;
//    }

    private String generateCompanyEmail(){
        StringBuilder builder = new StringBuilder();
        builder.append(firstName.toLowerCase()).append(".")
                .append(lastName.toLowerCase()).append("@")
                .append(department).append(".")
                .append(companySuffix);
        companyEmail = builder.toString();
        return builder.toString();
    }


    // Generate a random password
    private String randomPassword() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        Random rd = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<defaultPasswordLength;i++){
            int character = rd.nextInt(41);
            builder.append(str.charAt(character));
        }
        password = builder.toString();
        return builder.toString();
    }

    public String showInfo() throws IOException {
//        must hava a return type to print?
        String s = "";
        displayName();
        System.out.println("DEPARTMENT: " + department);
        System.out.println("COMPANY EMAIL: "+ companyEmail);
        System.out.println("PASSWORD: " + password);
        System.out.println("MAILBOX CAPACITY: "+ mailboxCapacity + "mb");

        return s;

        // read from compile and write into file of EmployeeEmail.data

//        FileOutputStream fos = new FileOutputStream(file);
//        ObjectOutput oos = new ObjectOutput(fos);
//        = oos.readObject
    }

    public void addEmailIntoFile(String information){

       try{
           PrintWriter writer = new PrintWriter(new FileWriter(file,true),true);
           writer.println(information);

           writer.close();
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

    public void displayName(){
        System.out.println("DISPLAY NAME " + firstName + " " + lastName);
    }

    public void changePassword(String firstName, String lastName,
                               String oldPassword, String newPassword){
        if ((this.firstName==firstName)&&(this.lastName == lastName)&&(password==oldPassword)){
            password = newPassword;
        }
        else System.out.println("Please enter valid information");
    }
}

