public class squareofsorted{
    public static int[] square(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int[] result = new int[n];
        for(int i = n-1 ; i>=0; i--){
           int leftSquare = arr[left] *arr[left];
           int rightSquare = arr[right] * arr[right];

           if(leftSquare > rightSquare){
            result[i] = leftSquare;
            left++;
           }
           else{
            result[i] = rightSquare;
            right--;
           }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] solution = square(arr);

        for(int num : solution){
            System.out.println(num + " ");
        }
    }
}