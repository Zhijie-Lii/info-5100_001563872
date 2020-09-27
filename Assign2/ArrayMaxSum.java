/**
 * The deadline of this assignment is 09/25/2020 23:59 PST.
 * Please feel free to contact Yafei and Yaqi for any questions.
 */

public class ArrayMaxSum {
    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number)
     * which has the largest sum and outprint its sum.
     *
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     */
    public static int maxSubArray(int[] nums) {
        //write your code here 
        double sumSubarray, maxSum; int size = nums.length;
        sumSubarray = 0; maxSum = -500;
        for (int i=0; i<size ; i++){

            for (int j=i; j<size; j++){
                sumSubarray = sumSubarray+ nums[j];

                if (sumSubarray>maxSum) {
                    maxSum = sumSubarray;
                }
            }
        }
        return (int) maxSum;
    }

    public static void main(String[] args) {
        //write your code here

        int[] a = {-1,0,3,-2,-5,4,-1,0,3,-3,1};
        maxSubArray(a);
        System.out.println("The maximum sum of contiguous subarray is " + maxSubArray(a));
    }
}

