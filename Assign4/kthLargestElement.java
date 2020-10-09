public class KthLargestElement {
// bubble sort
     public int kthLargestElement(int [] arr, int k){
        boolean isSorted = false;

        while (!isSorted){
            isSorted = true;  // without this statement, the macbook blown out?
            for (int i = 0;i< arr.length-1; i++){
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                    isSorted = false;
                }
            }
        }
        int kth = arr[arr.length-k];
        return kth;
    }

    public static void swap(int[] array, int i, int j){
       int temp = array[j];
       array[j] = array[i];
       array[i] = temp;
    }
}

class test {
    public static void main(String[] args) {
        int [] a = {3,2,4,6,8,3,1,7,2};
        int k= 3;
        KthLargestElement exm = new KthLargestElement();
        int answer= exm.kthLargestElement(a,k);
        System.out.println(exm.kthLargestElement(a,3));
    }
}



