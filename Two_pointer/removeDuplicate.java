public class removeDuplicate{
    public static int remove(int[] arr){
        int i =0;
        for(int j = 1 ; j<arr.length ; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4};
        int result = remove(arr);
        System.out.println("after removing the duplicate");
        for(int i = 0; i<result ; i++){
            System.out.println(arr[i] + " ");
        }
    }
}