package emailapp;

import java.io.IOException;

public class EmailApp {

    public static void main(String[] args) throws IOException {
        Email em1 = new Email("John", "Smith");
        System.out.println(em1.showInfo());

//        em1.changePassword("John","Smith","WDR9C6GI0O","123456");
    }
}
