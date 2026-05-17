public class Twosum{
    public static int[] TwoSum(int[] nums , int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start < end){
            int sum = nums[start] +  nums[end];

            if(sum == target){
                return new int[]{start , end};
            }
            else if(sum < target){
                start ++;
            }
            else{
                end--;
            }
        }
           return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = TwoSum(nums, target);
        if(ans[0] != -1){
            System.out.println("Indices :" + ans[0] + " "+ ans[1]);
            System.out.println("Value :" + nums[ans[0]] + " " + nums[ans[1]]);
        }
        else{
            System.out.println("No Pair found");
        }
    }
}