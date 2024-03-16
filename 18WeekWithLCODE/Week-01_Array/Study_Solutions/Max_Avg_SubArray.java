/**
 * Max_Avg_SubArray
 */
public class Max_Avg_SubArray {

    public static double findMaxAvg(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        int maxSum = sum;
        int startIndex = 0;
        int endIndex = k;
        while (endIndex < nums.length) {
            sum = dum - nums[startIndex];
            startIndex++;

            sum = sum + nums[endIndex];
            endIndex++;
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 12, -5, -6, 50, 3 };
        double res = findMaxAvg(arr, 4);
        System.out.println(res);

    }
}