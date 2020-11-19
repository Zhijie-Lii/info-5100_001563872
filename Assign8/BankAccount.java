package bankAccount;

public class BankAccount extends Thread{
    private String name;
    private double accNumber;
    private int balance;
//    private String password;

    public BankAccount(String name,double accNumber, int initialDeposit){
        this.name = name;
        this.accNumber = accNumber;
        balance = initialDeposit;
    }

    public synchronized void deposit(int amount){

        balance += amount;
        try{
            Thread.sleep(500);
        } catch(InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        System.out.println("After deposit balance = "+ balance);
    }

    public synchronized void withdraw(int amount){
        if (balance < amount){
            System.out.println("Insufficient balance!");
            return;
        }else {
            balance -= amount;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
            System.out.println("After withdraw balance = " + balance);
        }
    }

    public int getBalance(){
        return balance;
    }

}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount zhijieChase = new BankAccount("zhijie",13141014,
                100);
//        Thread th1 = new Thread(zhijieChase);
//        Thread th2 = new Thread(zhijieChase);
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<3; i++){
                    zhijieChase.withdraw(3000);
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<4;i++){
                    zhijieChase.deposit(2000);
                }
            }
        });

        th1.start();
        th2.start();
    }
}
