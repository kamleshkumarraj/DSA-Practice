package Array;

public class findLastAccurance {
    static int findLastAccuranceInArray(int arr[] , int x){
        int count = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == x){
                count = i;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findLastAccuranceInArray(arr,5));
    }
}
