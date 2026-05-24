import java.util.Arrays;

public class Tripletcount{
    public static int countTriplet(int[] nums , int sum){
           int n = nums.length;
           int count = 0;

           Arrays.sort(nums);

           for(int i = 0 ; i<n-2; i++){
            int left = i+1;
            int right = n-1;

            while(left < right){
                int currSum = nums[i] + nums[left] + nums[right];
                if(currSum < sum){
                    count += (right-left);
                    left++;
                }else{
                    right--;
                }
            }
           
           }
            return count;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 1, 3};
          int sum = 2;
          int result = countTriplet(nums, sum);
          System.out.println(result);
    }
}