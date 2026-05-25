public class sortColor{
    public static void sortcolor(int[] nums){
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){

            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] =  temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid]=temp;
               high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums= {0,1,1,2,1,0};
         sortcolor(nums);
         for(int num :nums){
            System.err.println(num + " ");
         }

    }
}