class reverseHello extends Thread {
    private int counter;

    public reverseHello(int counter) {
        super("Thread " + counter);
        this.counter = counter;
    }

    public void run() {
//        If the sequence number is less than 51 then:
//          create a new child thread with the sequence number + 1.
//          then start the child thread and wait for it to finish.
        counter++;
        if (counter <= 51) {
            // not working with while?
            reverseHello t = new reverseHello(counter);
            t.start();
            try {
                t.join();
                System.out.println("Hello from " + getName());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        reverseHello th1 = new reverseHello(1);
        th1.start();
    }
}