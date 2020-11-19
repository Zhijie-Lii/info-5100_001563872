
import java.util.Random;

public class MaximumValue extends Thread{

    private static void generateRandomArray(int[] arr) {
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
    }

    private static int findMaximum(int arr[]){
        int[] max = new int[4];
        int maxInThread = 0;
        int n = arr.length/4;
//        for (int i=start;i<end;i++){
//            if (arr[i]>temp){
//                temp = arr[i];
//            }
//        }
        Thread th1 = new Thread(()->{
            max[0] = 0;
            for (int i=0; i<n; i++){
                if (arr[i]>max[0]){
                    max[0] = arr[i];
                }

            }
        });

        Thread th2 = new Thread(()->{
            max[1] = 0;
            for(int i=n; i<2*n; i++){
                if (arr[i]>max[1]){
                    max[1] = arr[i];
                }
            }
        });

        Thread th3 = new Thread(()->{
            max[2] = 0;
            for(int i=2*n; i<3*n; i++){
                if (arr[i]>max[2]){
                    max[2] = arr[i];
                }
            }
        });

        Thread th4 = new Thread(()->{
            max[3] = 0;
            for(int i=3*n; i<4*n; i++){
                if (arr[i]>max[3]){
                    max[3] = arr[i];
                }
            }
        });

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        try{
            th1.join();
            th2.join();
            th3.join();
            th4.join();
            maxInThread = compareMaxInThread(max);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        return maxInThread;
    }


//    public static void separateIntoSeveral(int arr[], int numberOfParts) {
//        int Max =0;
//        SubArrayThread th1 = new SubArrayThread(new Runnable() {
//            @Override
//            public void run() {
//                    findMaximum(arr,0, 10000+10000);
//            })
//
//        }
//    }

    public static class SubArrayThread extends Thread {
        private int Max = 0;
        public int[] max = new int[4];

    }

    public static int compareMaxInThread(int[] arr) {
        int temp = 0;
        for (int i=0;i<arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }

        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[40000];
        generateRandomArray(arr);
        int maxValue = findMaximum(arr);
        System.out.println("The Max value among the array is " + maxValue);
    }

}
