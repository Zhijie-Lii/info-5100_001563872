import java.util.Random;

public class SumValue extends Thread implements Runnable{
    int[] arr;
    long ThreadSum = 0;

    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr){
        Random rdNumber = new Random();

        for(int i=0;i<1000000; i++){
            arr[i] = rdNumber.nextInt(11);
        }
    }

    public void run(){
        generateRandomArray(arr);
        ThreadSum = sum(arr);

    }

    /*get sum of an array using 4 threads*/
    static long sum(int[] arr){
        long ThisThreadSum = 0;
        for (int i=0;i<1000000; i++){
            ThisThreadSum += arr[i];
        }
        System.out.println(ThisThreadSum);
        return ThisThreadSum;
    }


    public static void main(String[] args){
//        int[] arr = new int[4000000];
//        generateRandomArray(arr);

        SumValue thread1 = new SumValue();
        SumValue thread2 = new SumValue();
        SumValue thread3 = new SumValue();
        SumValue thread4 = new SumValue();
        //Why here could not be Thread bla = new SumValue?

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            long sumTogether = thread1.ThreadSum + thread2.ThreadSum +
                    thread3.ThreadSum + thread4.ThreadSum;
            System.out.println("Sum: " + sumTogether);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }

        //long sum = sum(arr);
    }
}
